package Tipos_de_layout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Formulario_De_Usuario extends JFrame {

    private JTextField textfield_Usuario;
    private JPasswordField passwordField_Contraseña;
    private JButton boton_Iniciar;
    private JLabel label_usuario;
    private JLabel label_contraseña;
    private JLabel label_chivato;
    private JPanel JPanel0;

    public Formulario_De_Usuario() {
        setSize(800, 400); // Ajustar tamaño del JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Iniciamos los componentes
        JPanel0 = new JPanel(new GridLayout(5, 1, 10, 10)); // 5 filas, 1 columna, con espacio entre componentes
        label_usuario = new JLabel("Usuario:", SwingConstants.CENTER);
        textfield_Usuario = new JTextField(15);
        label_contraseña = new JLabel("Contraseña:", SwingConstants.CENTER);
        passwordField_Contraseña = new JPasswordField(15);
        label_chivato = new JLabel("El usuario correcto es Teide y la contraseña correcta es Thanos", SwingConstants.CENTER); // Etiqueta de mensaje
        boton_Iniciar = new JButton("Iniciar sesión");

        // Añadir componentes al JPanel con alineación centrada
        JPanel0.add(label_usuario);
        JPanel0.add(textfield_Usuario);
        JPanel0.add(label_contraseña);
        JPanel0.add(passwordField_Contraseña);
        JPanel0.add(label_chivato);
        JPanel0.add(boton_Iniciar);

        // Añadimos el panel al JFrame
        add(JPanel0);

        // Accion del boton
        boton_Iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCredenciales();
            }
        });
    }

    private void validarCredenciales() {
        String usuario = textfield_Usuario.getText();
        String contraseña = new String(passwordField_Contraseña.getPassword());

        if (usuario.equals("Teide") && contraseña.equals("Thanos")) {
            label_chivato.setText("Bienvenido!");
        } else if (!usuario.equals("Teide") && !contraseña.equals("Thanos")) {
            label_chivato.setText("Usuario y contraseña incorrectos.");
        } else if (!usuario.equals("Teide")) {
            label_chivato.setText("Usuario incorrecto.");
        } else {
            label_chivato.setText("Contraseña incorrecta.");
        }
    }

    public static void main(String[] args) {
        Formulario_De_Usuario formulario = new Formulario_De_Usuario();
        formulario.setVisible(true);
    }
}
