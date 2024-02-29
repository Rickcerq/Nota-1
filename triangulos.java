public class triangulos {
    double comprimento1, comprimento2, comprimento3;
    
    public void condicao_existencia () {
        if (comprimento1 + comprimento2 > comprimento3 || comprimento1 + comprimento3 > comprimento2 || comprimento2 + comprimento3 > comprimento1) {
         System.out.println("É possível sim formar um triângulo");
        }

        else {
            System.out.println("Não é possivel formar um triângulo");
        }
    }

    
    public void tipo_triangulo () {
        if (comprimento1 == comprimento3 && comprimento2 == comprimento3) {
         System.out.println("É um triângulo equilátero");
             }

            else if (comprimento1 == comprimento2 || comprimento2 == comprimento3 || comprimento1 == 3) {
                System.out.println("É um triângulo isósceles");
            }

            else {
                System.out.println("É um triângulo escaleno");
            }


        }
    }