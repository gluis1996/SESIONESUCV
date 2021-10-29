package clase_s6;

import javax.swing.JOptionPane;

public class Clase_s6 {

    public static void main(String[] args) {

        Lista Lista2 = new Lista();
        int opcion = 0, el = 0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Mantenimiento NODO \n\n"
                        + "1: Agregar un elemento al inicio de la lista \n"
                        + "2: Agregar un elemento al final de la lista \n"
                        + "3: Eliminar un elemento inicio de la lista \n"
                        + "4: Eliminar un elemento final de la lista \n"
                        + "5: Eliminar un elemento específico \n"
                        + "6: Buscar elemento de la lista \n"
                        + "7: Mostrar los Datos de la lista \n"
                        + "8: Salir", "Menu de opciones ", 3));
                switch (opcion) {

                    case 1: try {
                        el = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento", "Insertando el inicio", 3));

                        Lista2.agregarInicio(el);
                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                    }
                    break;
                    case 2: 
                try {
                        el = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento", "Insertando el inicio", 3));

                        Lista2.agregarAlFinal(el);

                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                    }
                    break;

                    case 3: 
                try {
                        el = Lista2.borrarDelInicio();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es el " + el,
                                "Eliminando Nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                    }
                    break;

                    case 4: 
                try {
                        el = Lista2.borrarAlFinal();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es el " + el,
                                "Eliminando Nodo del final", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                    }
                    break;

                    case 5: 
                try {
                        el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a eliminar",
                                "Eliminando Nodo específico", JOptionPane.INFORMATION_MESSAGE));
                        Lista2.eliminarNodoEspecifico(el);
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es el " + el,
                                "Eliminando Nodo específico", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                    }
                    break;

                    case 6: try {
                        el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a buscar",
                                "Eliminando a buscar", JOptionPane.INFORMATION_MESSAGE));

                        if (Lista2.Buscar(el) == true) {
                            JOptionPane.showMessageDialog(null, "El elemento ubicado es [" + el+"] Si está en la LISTA", "Buscar", JOptionPane.INFORMATION_MESSAGE);
                        }else {
                        JOptionPane.showMessageDialog(null, "Elemento [" + el + "] no se ubicó", "Buscar",JOptionPane.INFORMATION_MESSAGE);}
                        
                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                    }
                    break;

                    case 7: Lista2.mostrarLista();
                    break;

                    case 8: JOptionPane.showMessageDialog(null, "Fin del programa");
                    break;
                    default: JOptionPane.showMessageDialog(null, "Opción incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, No existe Dato!");
            }
            }
            while (opcion != 8);
        }

    }
