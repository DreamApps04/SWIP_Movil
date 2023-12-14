package com.swip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class ProjectConfig implements WebMvcConfigurer {    
   /* Los siguiente mÃ©todos son para implementar el tema de seguridad dentro del proyecto */
 @Override
public void addViewControllers(ViewControllerRegistry registry) {             
    registry.addViewController("/login").setViewName("login");
    registry.addViewController("/index").setViewName("index");
    registry.addViewController("/").setViewName("redirect:/login");  // Redirige a /login
    registry.addViewController("/registro/nuevo").setViewName("/registro/nuevo");
}

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((request) -> request
                .requestMatchers("/","/index","/errores/**",               
                "/registro/**","/js/**","/webjars/**", "/css/**",
                    "/ingreso/nuevo", "/ingreso/guardar","/ingreso/**",
                        "/ingreso/eliminar/{idIngreso}","/ahorro/nuevo", "/ahorro/guardar",
                        "/ahorro/listado","/ahorro/**",
                        "/ahorro/eliminar/{idAhorro}", "/credito/nuevo",
                        "/credito/creditos", "/credito/modifica/**",
                        "/credito/guardar", "/credito/eliminar/{idCredito}**",
                        "/presupuesto/listado", "/presupuesto/eliminar/{idPresopuesto}**", 
                        "/presupuesto/guardar", "/reportes/**", "/reportes/usuarios/**")
                        .permitAll()
                .requestMatchers(
                        "/usuario/**","/usuario/nuevo","/usuario/guardar",
                        "/usuario/modificar/**","/usuario/eliminar/**"
                ).hasRole("ADMIN")
                )
                .formLogin((form) -> form
                .loginPage("/login").permitAll()
                .defaultSuccessUrl("/index", true))
                .logout((logout) -> logout.permitAll());
        return http.build();
    }
  
    @Autowired
    private UserDetailsService userDetailsService;
    
    @Autowired
    public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception {
        build.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }
}
