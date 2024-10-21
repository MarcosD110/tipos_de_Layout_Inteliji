package Tipos_de_layout;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.classfile.instruction.NewMultiArrayInstruction;

public class Box_Layout extends JFrame{
    private JPanel JPanel1;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private ButtonGroup grupo1;

    public Box_Layout(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel1 = new JPanel(); //Iniciar el panel
        JPanel1.setLayout(new BoxLayout(JPanel1, BoxLayout.Y_AXIS)); //Para convertir el panel en BoxLayout.

        //Iniciar los Botones
        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
        boton3 = new JButton("Botón 3");
        boton4 = new JButton("Botón 4");
        boton5 = new JButton("Botón 5");

        //Añadir los botones al JPanel
        JPanel1.add(boton1);
        JPanel1.add(boton2);
        JPanel1.add(boton3);
        JPanel1.add(boton4);
        JPanel1.add(boton5);

        //Añadir los botones al grupo de botones.
        grupo1 = new ButtonGroup();
        grupo1.add(boton1);
        grupo1.add(boton2);
        grupo1.add(boton3);
        grupo1.add(boton4);
        grupo1.add(boton5);

        //Añadir los listener a los botones (ejecutara las acciones cuando el usuario haga que sucedan)
        boton1.addMouseListener(new MouseAdapter() {
            @Override //Quiere decir que esta sobreescribiendo un metodo que ya existe en el codigo.
            public void mouseClicked (MouseEvent e) {
                JOptionPane.showMessageDialog(null, "El botón seleccionado es el 1");
            }
        });

        boton2.addMouseListener(new MouseAdapter() {
            @Override //Quiere decir que esta sobreescribiendo un metodo que ya existe en el codigo.
            public void mouseClicked (MouseEvent e) {
                JOptionPane.showMessageDialog(null, "El botón seleccionado es el 2");
            }
        });

        boton3.addMouseListener(new MouseAdapter() {
            @Override //Quiere decir que esta sobreescribiendo un metodo que ya existe en el codigo.
            public void mouseClicked (MouseEvent e) {
                JOptionPane.showMessageDialog(null, "El botón seleccionado es el 3");
            }
        });

        boton4.addMouseListener(new MouseAdapter() {
            @Override //Quiere decir que esta sobreescribiendo un metodo que ya existe en el codigo.
            public void mouseClicked (MouseEvent e) {
                JOptionPane.showMessageDialog(null, "El botón seleccionado es el 4");
            }
        });

        boton5.addMouseListener(new MouseAdapter() {
            @Override //Quiere decir que esta sobreescribiendo un metodo que ya existe en el codigo.
            public void mouseClicked (MouseEvent e) {
                JOptionPane.showMessageDialog(null, "El botón seleccionado es el 5");
            }
        });

        //Tenemos que añadir el JPanel al JFrame.
        add(JPanel1);

    }

    public static void main(String[] args) {
        Box_Layout JFrame = new Box_Layout();
        //Hacer visible el JFrame.
        JFrame.setVisible(true);
    }

}
