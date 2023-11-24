package com.swip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity

public class SecurityConfig implements WebMvcConfigurer {

    /* Los siguiente métodos son para implementar el tema de seguridad dentro del proyecto */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/login").setViewName("login");
    }
    
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((request) -> request.requestMatchers("/", "/Index", "/js/**", "/webjars/**")
                    .permitAll()
                .requestMatchers(
                "/ahorro/listado", "/ahorro/modifica", "/ahorro/guardar",
                "/ahorro/eliminar/{idAhorro}",
                "/ahorro/modificar/{idAhorro}",
                "/credito/creditos",
                "/credito/modifica",
                "/credito/guardar",
                "/credito/eliminar/{idCredito}",
                "/credito/modifica", "/ingreso/nuevo",
                "/ingreso/guardar", "/ingreso/eliminar/{idIngreso}",
                "/ingreso/modificar/{idIngreso}",
                "usuario/nuevo", "/usuario/guardar",
                "/usuario/eliminar/{idUsuario}", "/usuario/modificar/{idUsuario}{} ",  "/ahorro/listado",
                "/ingreso/listado", "/usuario/listado").
                permitAll()).formLogin((form) -> form
                .loginPage("/login").permitAll())
                .logout((logout) -> logout.permitAll());
        return http.build();
    }

    @Bean
    public UserDetailsService users() {
        UserDetails admin = User.builder().username("admin").password("{noop}admin123").roles( "ADMIN").build();

        return new InMemoryUserDetailsManager(admin);
    }
    
    
}
