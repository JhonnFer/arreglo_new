public class Principal {
    int [] cedula = new int[3];
    String[]nombre= new String[3];

    int totalIngreso=0;

    public void agregarClientes(int cedula, String nombre){

        if(totalIngreso<3) {
            this.cedula[totalIngreso] = cedula;
            this.nombre[totalIngreso] = nombre;

            totalIngreso++;
            System.out.println("cliente agregado");
        }else{
            System.out.println("NO SE PUEDE AGREGAR MAS INFORMACION ");

        }




    }
    public void mostrarCliente(){
        if(totalIngreso==0){
            System.out.println("NO HAY MAS CLIENTES");

        }else{
            for (int i =0; i < totalIngreso; i++ ){
                System.out.println("cedula"+cedula[i] + "nombre "+ nombre[i]);
            }
        }
    }

}
