package Tipos_de_layout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Group_Layout extends JFrame {
    private JPanel JPanel1;
    private JTextField textfield1;
    private JButton boton_Aceptar;
    private JLabel nombre_label;

    public Group_Layout() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializamos el JPanel y le damos el tipo de layout
        JPanel1 = new JPanel();
        GroupLayout layout = new GroupLayout(JPanel1);
        JPanel1.setLayout(layout);

        // Inicializar componentes
        textfield1 = new JTextField(10);
        nombre_label = new JLabel("Nombre:");
        boton_Aceptar = new JButton("Aceptar");

        // Agregar ActionListener al botón
        boton_Aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarNombre(e);
            }
        });

        // Configurar gaps automáticos
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        // Disposición horizontal
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(nombre_label)
                        .addComponent(textfield1)
                        .addComponent(boton_Aceptar)
        );
        // Disposición vertical
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(nombre_label)
                                .addComponent(textfield1))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE) // Espacio flexible
                        .addComponent(boton_Aceptar)
        );

        // Añadimos el panel al JFrame
        add(JPanel1);
    }

    private void validarNombre(ActionEvent e) {
        String texto = textfield1.getText();
        if (texto.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(null, "Nombre aceptado, bienvenido " + texto);
        } else {
            JOptionPane.showMessageDialog(null, "Nombre no válido, solo se aceptan letras.");
        }
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        Group_Layout frame = new Group_Layout();
        frame.setVisible(true);
    }
}
