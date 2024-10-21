package Tipos_de_layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Grid_Layout extends JFrame {
    private JPanel JPanel1;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private ButtonGroup grupo1;

    public Grid_Layout() {
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Inicializar el panel y darle el GridLayout.
        JPanel1 = new JPanel();
        JPanel1.setLayout(new GridLayout(3, 2)); //Es un layout de tipo GridLayout de 3 FILAS y 2 COLUMNAS.

        //Inicializar los botones.
        boton1 = new JButton(" Botón 1 ");
        boton2 = new JButton(" Botón 2 ");
        boton3 = new JButton(" Botón 3 ");
        boton4 = new JButton(" Botón 4 ");
        boton5 = new JButton(" Botón 5 ");

        //Añadimos los botones al JPanel.
        JPanel1.add(boton1);
        JPanel1.add(boton2);
        JPanel1.add(boton3);
        JPanel1.add(boton4);
        JPanel1.add(boton5);

        //Y ahora añadimos los botones al grupo para los botones que hemos creado.
        grupo1 = new ButtonGroup();
        grupo1.add(boton1);
        grupo1.add(boton2);
        grupo1.add(boton3);
        grupo1.add(boton4);
        grupo1.add(boton5);

        //Añadimos el JPanel al JFrame
        add(JPanel1);

        //Agregamos el MouseListener para que cada vez que usemos el botón tengan una accción.
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null, "Has hecho click en el botón 1");
            }
        });

        boton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null, "Has hecho click en el botón 2");
            }
        });

        boton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null, "Has hecho click en el botón 3");
            }
        });

        boton4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null, "Has hecho click en el botón 4");
            }
        });

        boton5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null, "Has hecho click en el botón 5");
            }
        });

        //Hacemos visible la ventana
        setVisible(true);

    }

    public static void main(String[] args) {
        new Grid_Layout();
    }

}
