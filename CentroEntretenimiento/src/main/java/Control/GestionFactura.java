/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Control;

import Model.Cliente;
import Model.Empleado;
import Model.Factura;
import Model.PlanEntrenamiento;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionFactura implements Pago {
    ArrayList<Cliente> listaClientes;
    ArrayList<PlanEntrenamiento> listaPlanes;
    ArrayList<Factura> listaFacturas;
    int contadorFacturas;

    public GestionFactura(ArrayList<Cliente> listaClientes, ArrayList<PlanEntrenamiento> listaPlanes, ArrayList<Factura> listaFactura) {
        this.listaClientes = listaClientes;
        this.listaPlanes = listaPlanes;
        this.listaFacturas = new ArrayList<>();
        this.contadorFacturas = 0; 
    }

    public void crearFactura(Cliente cliente, Empleado cajero) {
        Scanner sc = new Scanner(System.in);
        int numeroFactura = ++contadorFacturas; 
        String mesPaga = cliente.getMesActual();
        double valorPagado = cliente.getDeuda(); 

        System.out.println("Seleccione método de pago:");
        System.out.println("1) Efectivo");
        System.out.println("2) Cheque");
        System.out.println("3) Tarjeta");
        int opcion = sc.nextInt();
        sc.nextLine(); 

        String formaDePago = "";

        switch (opcion) {
            case 1:
                formaDePago = pagoEfectivo(sc);
                break;
            case 2:
                formaDePago = pagoCheque(sc);
                break;
            case 3:
                formaDePago = pagoTarjeta(sc);
                break;
            default:
                System.out.println("Opción inválida, se cancela la factura.");
                return;
        }

        Factura factura = new Factura(
                numeroFactura,
                cliente,
                mesPaga,
                valorPagado,
                formaDePago,
                cajero
        );

        listaFacturas.add(factura);
        cliente.setDeuda(0);

        System.out.println("\n✔ Factura generada con éxito:");
        System.out.println("Número: " + numeroFactura);
        System.out.println("Cliente: " + cliente.getNombres() + " " + cliente.getApellidos());
        System.out.println("Valor pagado: $" + valorPagado);
        System.out.println("Forma de pago: " + formaDePago);
        System.out.println("Atendido por: " + cajero.getNombres());
    }

    public Cliente estadoDeuda() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese identificación para buscar: ");
        String identificacion = entrada.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente c : listaClientes) {
            if (c.getIdentificación().equals(identificacion)) {
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null) {
            System.out.println("Cliente con identificación " + identificacion + " no fue encontrado.");
        } else {
            System.out.print("Ingrese el mes a consultar: ");
            String mes = entrada.nextLine();

            System.out.println("\nEstado de cuenta de: " + clienteEncontrado.getNombres() + " " + clienteEncontrado.getApellidos());
            if (clienteEncontrado.getMesActual().equalsIgnoreCase(mes)) {
                if (clienteEncontrado.getDeuda() > 0) {
                    System.out.println("Mes: " + mes);
                    System.out.println("Deuda actual: $" + clienteEncontrado.getDeuda());
                    System.out.println("No tiene derecho al gimnasio hasta pagar la deuda.");
                    return clienteEncontrado;
                } else {
                    System.out.println("Mes: " + mes);
                    System.out.println("Estás al día con los pagos.");
                    System.out.println("Tiene derecho al gimnasio.");
                }
            } else {
                System.out.println("En el mes " + mes + " no tiene deuda registrada.");
            }
        }
        return clienteEncontrado;
    }
    public void arqueoCaja() {
        if (listaFacturas.isEmpty()) {
            System.out.println("No se han registrado facturas aún.");
            return;
    }
        double totalRecaudado = 0;
        System.out.println("\n===== Arqueo de Caja =====");
        for (Factura f : listaFacturas) {
            System.out.println("Cliente: " + f.getCliente().getNombres() + " " + f.getCliente().getApellidos());
            System.out.println("Valor pagado: $" + f.getValorpagado());
            System.out.println("Forma de pago: " + f.getFormaDePago());
            System.out.println("------------------------------------");
        totalRecaudado += f.getValorpagado();
        }

    System.out.println("Total recaudado: $" + totalRecaudado);
    System.out.println("===== Fin del arqueo =====\n");
}

    @Override
    public String pagoEfectivo(Scanner sc) {
        System.out.print("Ingrese el valor a pagar: ");
        double valor = sc.nextDouble();
        sc.nextLine();
        return "Efectivo - Valor: $" + valor;
    }

    @Override
    public String pagoCheque(Scanner sc) {
        System.out.print("Banco del cheque: ");
        String banco = sc.nextLine();
        System.out.print("Número del cheque: ");
        String numero = sc.nextLine();
        return "Cheque - Banco: " + banco + ", Número: " + numero;
    }

    @Override
    public String pagoTarjeta(Scanner sc) {
        System.out.print("Ingrese el banco: ");
        String banco = sc.nextLine();
        System.out.print("Ingrese el número de tarjeta: ");
        String numero = sc.nextLine();
        System.out.print("Ingrese el valor a pagar: ");
        double valor = sc.nextDouble();
        sc.nextLine();
        return "Tarjeta - Banco: " + banco + ", Tarjeta: " + numero + ", Valor: $" + valor;
    }
}



