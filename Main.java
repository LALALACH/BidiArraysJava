    // Ghost
    //Students, this documentation is for guidance only, do not use it to promote ignorance.

    import java.util.Scanner;
    public class Main {
        public static void Menu(){
            var sout = System.out;
            sout.println("1. Sumar");
            sout.println("2. Restar");
            sout.println("3. Multiplicar");
            sout.println("4. Salir");
        }
        public static double Suma(double x, double y){
            return x + y;
        }
        public static double Resta(double x, double y){
            return x - y;
        }
        public static double Multiplicacion(double x, double y){
            return x * y;
        }

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            var sout = System.out;
            Boolean buclePrincipal = true;
            byte opcion = 0;
            double[][] primerArreglo = new double[3][3];
            double[][] segundoArreglo = new double[3][3];
            double[][] resultado = new double[3][3];
            sout.println("BIENVENIDO A LA CALCULADORA DE MATRICES!");
            do {
                sout.println("Qué acción quieres realizar?");
                Menu();
                try{
                    opcion = entrada.nextByte();
                    if(opcion != 4){
                        sout.println("MUY BIEN!\nVamos con la primera matriz 3x3");
                        for(int i = 0; i <= 2; i ++){
                            for(int x = 0; x <= 2; x ++){
                                sout.println(String.valueOf(x+1) + "," + String.valueOf(i+1));
                                primerArreglo[x][i] = entrada.nextDouble();
                            }
                        }
                        sout.println("Vamos con la segunda matriz 3x3");
                        for(int i = 0; i <= 2; i ++){
                            for(int x = 0; x <= 2; x ++){
                                sout.println(String.valueOf(x+1) + "," + String.valueOf(i+1));
                                segundoArreglo[x][i] = entrada.nextDouble();
                            }
                        }
                        switch (opcion){
                            case 1:
                                for(int i = 0; i <= 2; i++){
                                    for(int x = 0; x <= 2; x++){
                                        resultado[x][i] = Suma(primerArreglo[x][i], segundoArreglo[x][i]);
                                    }
                                }
                                break;
                            case 2:
                                for(int i = 0; i <= 2; i++){
                                    for(int x = 0; x <= 2; x++){
                                        resultado[x][i] = Resta(primerArreglo[x][i], segundoArreglo[x][i]);
                                    }
                                }
                                break;
                            case 3:
                                for(int i = 0; i <= 2; i++){
                                    for(int x = 0; x <= 2; x++){
                                        resultado[x][i] = Multiplicacion(primerArreglo[x][i], segundoArreglo[x][i]);
                                    }
                                }
                                break;
                            default:
                                sout.println("Ingresa un número de 1 a 4... Por favor!");
                        }
                        sout.println("RESULTADO:");
                        for(int i = 0; i <=2; i ++){
                            for (int x = 0; x <=2; x++){
                                sout.print(String.valueOf(resultado[x][i]) + "  ");
                            }
                            sout.println("");
                        }
                    }else {
                        buclePrincipal = false;
                    }

                }catch (Exception e){
                    sout.println("Ingresa una opción válida");
                }
                /*sout.println("Quieres continuar?\n1. Sí!\nCualquier otra cosa para NO");
                try{
                    opcion = entrada.nextByte();
                    if(opcion == 1){
                        sout.println("CONTINUEMOS!");
                    }else {
                        sout.println("HASTA LA PRÓXIMA! Sr...");
                        buclePrincipal = false;
                    }
                }catch (Exception e){
                    sout.println("HASTA LA PRÓXIMA!");
                    buclePrincipal = false;

                }*/
                opcion = 0;
            }while(buclePrincipal);
            sout.println("ADIOS! ÉXITOS EN TODO!");
        }
    }