package Interfaz;

import implementacion.de.uso.pokemon.ColaCPU;
import implementacion.de.uso.pokemon.ColaJugador;
import implementacion.de.uso.pokemon.Pokemon;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Pkv1 extends javax.swing.JFrame {

    public static ColaCPU colaSeleccionada = new ColaCPU();

    public Pkv1() {
        initComponents();
        Pokemon Arcanine = new Pokemon("Arcanine", "Fuego", 115, 70, 45, 80, 60);
        Pokemon Blaziken = new Pokemon("Blaziken", "Fuego", 115, 70, 45, 80, 60);
        Pokemon Infernape = new Pokemon("Infernape", "Fuego", 115, 70, 45, 80, 60);
        Pokemon Greninja = new Pokemon("Greninja", "Agua", 115, 70, 45, 80, 60);
        Pokemon Whooper = new Pokemon("Whooper", "Agua", 115, 70, 45, 80, 60);
        Pokemon Samurott = new Pokemon("Samurott", "Agua", 115, 70, 45, 80, 60);
        Pokemon Bidoof = new Pokemon("Bidoof", "Tierra", 115, 70, 45, 80, 60);
        Pokemon Furret = new Pokemon("Furret", "Tierra", 115, 70, 45, 80, 60);
        Pokemon Lopunny = new Pokemon("Lopunny", "Tierra", 115, 70, 45, 80, 60);
        colaCPU.encolar(Arcanine);
        colaCPU.encolar(Bidoof);
        colaCPU.encolar(Blaziken);
        colaCPU.encolar(Furret);
        colaCPU.encolar(Greninja);
        colaCPU.encolar(Infernape);
        colaCPU.encolar(Lopunny);
        colaCPU.encolar(Whooper);
        colaCPU.encolar(Samurott);

        for (int i = 0; i < 5; i++) {
            Pokemon pokemonSeleccionado = colaCPU.seleccionarAleatorio();
            if (pokemonSeleccionado != null) {
                colaSeleccionada.encolar(pokemonSeleccionado);
                System.out.println(pokemonSeleccionado.getNombre());
            } else {
                System.out.println("Has alcanzado el límite de 5 selecciones aleatorias.");
                break;
            }
        }

        
    }

    public void salir() {
        Principal volver = new Principal();
        volver.setVisible(true);
    }

    @SuppressWarnings("unchecked")

    public static ColaJugador colaPk = new ColaJugador();
    public static ColaCPU colaCPU = new ColaCPU();

    public void llenar() {

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Arcanine = new javax.swing.JButton();
        Blaziken = new javax.swing.JButton();
        Infernape = new javax.swing.JButton();
        Greninja = new javax.swing.JButton();
        Samurott = new javax.swing.JButton();
        Whooper = new javax.swing.JButton();
        Bidoof = new javax.swing.JButton();
        Furret = new javax.swing.JButton();
        Lopunny = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Arcanine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pok/arcanine icono.png"))); // NOI18N
        Arcanine.setText("Arcanine (Fuego)");
        Arcanine.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Arcanine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArcanineMouseClicked(evt);
            }
        });
        Arcanine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArcanineActionPerformed(evt);
            }
        });

        Blaziken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pok/blaziken icono.png"))); // NOI18N
        Blaziken.setText("Blaziken (Fuego)");
        Blaziken.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        Blaziken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BlazikenMouseClicked(evt);
            }
        });
        Blaziken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlazikenActionPerformed(evt);
            }
        });

        Infernape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pok/infernape icono.png"))); // NOI18N
        Infernape.setText("Infernape(Fuego)");
        Infernape.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        Infernape.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfernapeMouseClicked(evt);
            }
        });
        Infernape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfernapeActionPerformed(evt);
            }
        });

        Greninja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pok/greninja icono.png"))); // NOI18N
        Greninja.setText("Greninja (Agua)");
        Greninja.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        Greninja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GreninjaMouseClicked(evt);
            }
        });
        Greninja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreninjaActionPerformed(evt);
            }
        });

        Samurott.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pok/samurott icono.png"))); // NOI18N
        Samurott.setText("Samurott (Agua)");
        Samurott.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        Samurott.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SamurottMouseClicked(evt);
            }
        });
        Samurott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SamurottActionPerformed(evt);
            }
        });

        Whooper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pok/whooper icono.png"))); // NOI18N
        Whooper.setText("Whooper(Agua)");
        Whooper.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        Whooper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WhooperMouseClicked(evt);
            }
        });
        Whooper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhooperActionPerformed(evt);
            }
        });

        Bidoof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pok/bidoof icono_1.png"))); // NOI18N
        Bidoof.setText("Bidoof (Normal)");
        Bidoof.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        Bidoof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BidoofMouseClicked(evt);
            }
        });
        Bidoof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BidoofActionPerformed(evt);
            }
        });

        Furret.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pok/furret icono.png"))); // NOI18N
        Furret.setText("Furret (normal)");
        Furret.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        Furret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FurretMouseClicked(evt);
            }
        });
        Furret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FurretActionPerformed(evt);
            }
        });

        Lopunny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pok/Lopunny icono.png"))); // NOI18N
        Lopunny.setText("Lopunny (Normal)");
        Lopunny.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        Lopunny.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LopunnyMouseClicked(evt);
            }
        });
        Lopunny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LopunnyActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione su pokemon");

        jButton1.setText("Batalla");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Samurott, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Infernape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Arcanine, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                                    .addComponent(Bidoof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lopunny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Greninja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Whooper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Furret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Blaziken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel1)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Blaziken, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Arcanine, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Infernape, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Greninja, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Samurott, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Whooper, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bidoof, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Furret, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Lopunny, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArcanineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArcanineActionPerformed


    }//GEN-LAST:event_ArcanineActionPerformed

    private void BlazikenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlazikenActionPerformed

    }//GEN-LAST:event_BlazikenActionPerformed

    private void InfernapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfernapeActionPerformed

    }//GEN-LAST:event_InfernapeActionPerformed

    private void GreninjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreninjaActionPerformed

    }//GEN-LAST:event_GreninjaActionPerformed

    private void SamurottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SamurottActionPerformed

    }//GEN-LAST:event_SamurottActionPerformed

    private void WhooperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhooperActionPerformed

    }//GEN-LAST:event_WhooperActionPerformed

    private void BidoofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BidoofActionPerformed

    }//GEN-LAST:event_BidoofActionPerformed

    private void FurretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FurretActionPerformed

    }//GEN-LAST:event_FurretActionPerformed

    private void LopunnyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LopunnyActionPerformed

    }//GEN-LAST:event_LopunnyActionPerformed

    private void ArcanineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArcanineMouseClicked
        try {
                    // Abre el archivo de sonido
                    File soundFile = new File("page-turn-chime.wav"); // Asegúrate de tener este archivo en la ubicación correcta
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    // Obtiene un clip de sonido
                    Clip clip = AudioSystem.getClip();

                    // Abre el clip de audio y comienza a reproducir el sonido
                    clip.open(audioIn);
                    clip.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        
        
        if (colaPk.longitudCola() >= 5) {
            JOptionPane.showMessageDialog(null, "Ya su pokedex esta llena");

        } else {
            Pokemon pkFuego = new Pokemon("Arcanine", "Fuego", 115, 70, 45, 80, 60);
            colaPk.encolar(pkFuego);
            if (colaPk.longitudCola() == 5) {
                //Aqui se debe ensenar el JFrame de la batalla
                colaPk.MostrarContenido();

            } else {
                JOptionPane.showMessageDialog(null, "Cantidad de Pokemones: " + colaPk.longitudCola() + "\n " + " Aun faltan pokemones por elegir para poder batallar");
            }

        }


    }//GEN-LAST:event_ArcanineMouseClicked

    private void BlazikenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlazikenMouseClicked
        try {
                    // Abre el archivo de sonido
                    File soundFile = new File("page-turn-chime.wav"); // Asegúrate de tener este archivo en la ubicación correcta
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    // Obtiene un clip de sonido
                    Clip clip = AudioSystem.getClip();

                    // Abre el clip de audio y comienza a reproducir el sonido
                    clip.open(audioIn);
                    clip.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        
        if (colaPk.longitudCola() >= 5) {
            JOptionPane.showMessageDialog(null, "Ya su pokedex esta llena");

        } else {
            Pokemon pkFuego = new Pokemon("Blaziken", "Fuego", 115, 70, 45, 80, 60);
            colaPk.encolar(pkFuego);
            if (colaPk.longitudCola() == 5) {
                //Aqui se debe ensenar el JFrame de la batalla
                colaPk.MostrarContenido();

            } else {
                JOptionPane.showMessageDialog(null, "Cantidad de Pokemones: " + colaPk.longitudCola() + "\n " + " Aun faltan pokemones por elegir para poder batallar");
            }

        }

    }//GEN-LAST:event_BlazikenMouseClicked

    private void InfernapeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfernapeMouseClicked
        try {
                    // Abre el archivo de sonido
                    File soundFile = new File("page-turn-chime.wav"); // Asegúrate de tener este archivo en la ubicación correcta
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    // Obtiene un clip de sonido
                    Clip clip = AudioSystem.getClip();

                    // Abre el clip de audio y comienza a reproducir el sonido
                    clip.open(audioIn);
                    clip.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        
        
        if (colaPk.longitudCola() >= 5) {
            JOptionPane.showMessageDialog(null, "Ya su pokedex esta llena");

        } else {
            Pokemon pkFuego = new Pokemon("Infernape", "Fuego", 115, 70, 45, 80, 60);
            colaPk.encolar(pkFuego);
            if (colaPk.longitudCola() == 5) {
                //Aqui se debe ensenar el JFrame de la batalla
                colaPk.MostrarContenido();

            } else {
                JOptionPane.showMessageDialog(null, "Cantidad de Pokemones: " + colaPk.longitudCola() + "\n " + " Aun faltan pokemones por elegir para poder batallar");
            }

        }
    }//GEN-LAST:event_InfernapeMouseClicked

    private void GreninjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GreninjaMouseClicked
        try {
                    // Abre el archivo de sonido
                    File soundFile = new File("page-turn-chime.wav"); // Asegúrate de tener este archivo en la ubicación correcta
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    // Obtiene un clip de sonido
                    Clip clip = AudioSystem.getClip();

                    // Abre el clip de audio y comienza a reproducir el sonido
                    clip.open(audioIn);
                    clip.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        
        
        
        if (colaPk.longitudCola() >= 5) {
            JOptionPane.showMessageDialog(null, "Ya su pokedex esta llena");

        } else {
            Pokemon pkAgua = new Pokemon("Greninja", "Agua", 115, 70, 45, 80, 60);
            colaPk.encolar(pkAgua);
            if (colaPk.longitudCola() == 5) {
                //Aqui se debe ensenar el JFrame de la batalla
                colaPk.MostrarContenido();

            } else {
                JOptionPane.showMessageDialog(null, "Cantidad de Pokemones: " + colaPk.longitudCola() + "\n " + " Aun faltan pokemones por elegir para poder batallar");
            }

        }
    }//GEN-LAST:event_GreninjaMouseClicked

    private void SamurottMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SamurottMouseClicked
        try {
                    // Abre el archivo de sonido
                    File soundFile = new File("page-turn-chime.wav"); // Asegúrate de tener este archivo en la ubicación correcta
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    // Obtiene un clip de sonido
                    Clip clip = AudioSystem.getClip();

                    // Abre el clip de audio y comienza a reproducir el sonido
                    clip.open(audioIn);
                    clip.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        
        
        
        if (colaPk.longitudCola() >= 5) {
            JOptionPane.showMessageDialog(null, "Ya su pokedex esta llena");

        } else {
            Pokemon pkAgua = new Pokemon("Samurott", "Agua", 115, 70, 45, 80, 60);
            colaPk.encolar(pkAgua);
            if (colaPk.longitudCola() == 5) {
                //Aqui se debe ensenar el JFrame de la batalla
                colaPk.MostrarContenido();

            } else {
                JOptionPane.showMessageDialog(null, "Cantidad de Pokemones: " + colaPk.longitudCola() + "\n " + " Aun faltan pokemones por elegir para poder batallar");
            }

        }
    }//GEN-LAST:event_SamurottMouseClicked

    private void WhooperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WhooperMouseClicked
        try {
                    // Abre el archivo de sonido
                    File soundFile = new File("page-turn-chime.wav"); // Asegúrate de tener este archivo en la ubicación correcta
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    // Obtiene un clip de sonido
                    Clip clip = AudioSystem.getClip();

                    // Abre el clip de audio y comienza a reproducir el sonido
                    clip.open(audioIn);
                    clip.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        
        
        if (colaPk.longitudCola() >= 5) {
            JOptionPane.showMessageDialog(null, "Ya su pokedex esta llena");

        } else {
            Pokemon pkAgua = new Pokemon("Whooper", "Agua", 115, 70, 45, 80, 60);
            colaPk.encolar(pkAgua);
            if (colaPk.longitudCola() == 5) {
                //Aqui se debe ensenar el JFrame de la batalla
                colaPk.MostrarContenido();

            } else {
                JOptionPane.showMessageDialog(null, "Cantidad de Pokemones: " + colaPk.longitudCola() + "\n " + " Aun faltan pokemones por elegir para poder batallar");
            }

        }
    }//GEN-LAST:event_WhooperMouseClicked

    private void BidoofMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BidoofMouseClicked
        try {
                    // Abre el archivo de sonido
                    File soundFile = new File("page-turn-chime.wav"); // Asegúrate de tener este archivo en la ubicación correcta
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    // Obtiene un clip de sonido
                    Clip clip = AudioSystem.getClip();

                    // Abre el clip de audio y comienza a reproducir el sonido
                    clip.open(audioIn);
                    clip.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        
        
        if (colaPk.longitudCola() >= 5) {
            JOptionPane.showMessageDialog(null, "Ya su pokedex esta llena");

        } else {
            Pokemon pkNormal = new Pokemon("Bidoof", "Tierra", 115, 70, 45, 80, 60);
            colaPk.encolar(pkNormal);
            if (colaPk.longitudCola() == 5) {
                //Aqui se debe ensenar el JFrame de la batalla
                colaPk.MostrarContenido();

            } else {
                JOptionPane.showMessageDialog(null, "Cantidad de Pokemones: " + colaPk.longitudCola() + "\n " + " Aun faltan pokemones por elegir para poder batallar");
            }

        }
    }//GEN-LAST:event_BidoofMouseClicked

    private void FurretMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FurretMouseClicked
        try {
                    // Abre el archivo de sonido
                    File soundFile = new File("page-turn-chime.wav"); // Asegúrate de tener este archivo en la ubicación correcta
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    // Obtiene un clip de sonido
                    Clip clip = AudioSystem.getClip();

                    // Abre el clip de audio y comienza a reproducir el sonido
                    clip.open(audioIn);
                    clip.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        
        
        if (colaPk.longitudCola() >= 5) {
            JOptionPane.showMessageDialog(null, "Ya su pokedex esta llena");

        } else {
            Pokemon pkNormal = new Pokemon("Furret", "Tierra", 115, 70, 45, 80, 60);
            colaPk.encolar(pkNormal);
            if (colaPk.longitudCola() == 5) {
                //Aqui se debe ensenar el JFrame de la batalla
                colaPk.MostrarContenido();

            } else {
                JOptionPane.showMessageDialog(null, "Cantidad de Pokemones: " + colaPk.longitudCola() + "\n " + " Aun faltan pokemones por elegir para poder batallar");
            }

        }
    }//GEN-LAST:event_FurretMouseClicked

    private void LopunnyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LopunnyMouseClicked
        try {
                    // Abre el archivo de sonido
                    File soundFile = new File("page-turn-chime.wav"); // Asegúrate de tener este archivo en la ubicación correcta
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

                    // Obtiene un clip de sonido
                    Clip clip = AudioSystem.getClip();

                    // Abre el clip de audio y comienza a reproducir el sonido
                    clip.open(audioIn);
                    clip.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        
        
        if (colaPk.longitudCola() >= 5) {
            JOptionPane.showMessageDialog(null, "Ya su pokedex esta llena");

        } else {
            Pokemon pkNormal = new Pokemon("Lopunny", "Tierra", 115, 70, 45, 80, 60);
            colaPk.encolar(pkNormal);
            if (colaPk.longitudCola() == 5) {
                //Aqui se debe ensenar el JFrame de la batalla
                colaPk.MostrarContenido();

            } else {
                JOptionPane.showMessageDialog(null, "Cantidad de Pokemones: " + colaPk.longitudCola() + "\n " + " Aun faltan pokemones por elegir para poder batallar");
            }

        }
    }//GEN-LAST:event_LopunnyMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        salir();
    }//GEN-LAST:event_SalirMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Batalla b = new Batalla();
        if (colaPk.longitudCola() == 0) {
            JOptionPane.showMessageDialog(null, "Le faltan pokemones");
        } else {
            b.setVisible(true);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pkv1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Arcanine;
    private javax.swing.JButton Bidoof;
    private javax.swing.JButton Blaziken;
    private javax.swing.JButton Furret;
    private javax.swing.JButton Greninja;
    private javax.swing.JButton Infernape;
    private javax.swing.JButton Lopunny;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Samurott;
    private javax.swing.JButton Whooper;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
