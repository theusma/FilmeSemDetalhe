package br.usjt.ads.desmob.clienteads18.model;

public class ClienteDAO {

    private static Cliente[] clientes;

    private ClienteDAO(){}

    public static Cliente[] getClientes(){
        if(clientes == null){

            clientes = new Cliente[20];

            clientes[1] = new Cliente(1, "Star Wars VII", "d171215", "JJ Abrams", "17/12/15");
            clientes[1] = new Cliente(2,"Star Wars VIII","d141217", "Rian Johnson"  , "14/12/2017");
            clientes[2] = new Cliente(3,"Rei Leão","d080794", "Rob Minkoff", "08/07/1994");
            clientes[3] = new Cliente(4,"Toy Story","d221295", "John Lasseter"  , "22/12/1995");
            clientes[4] = new Cliente(5,"Vingadores: Guerra Infinita","d260418", "Irmãos Russo", "26/04/2018");
            clientes[5] = new Cliente(6,"Star Wars IV","d181177", "George Lucas"  , "18/11/1977");
            clientes[6] = new Cliente(7,"Star Wars VI","d061083", "George Lucas", "06/10/1983");
            clientes[7] = new Cliente(8,"Vingadores","d270412", "Joss Whedon"  , "27/04/2012");
            clientes[8] = new Cliente(9,"Vingadores: Era de Ultron","d230415", "Joss Whedon", "23/04/2015");
            clientes[9] = new Cliente(10,"Homem Aranha: De Volta ao Lar","d060717", "Jon Watts"  , "06/07/2017");
            clientes[10] = new Cliente(11,"Homem de Ferro","d300408", "Jon Favreau", "30/04/2008");
            clientes[11] = new Cliente(12,"Thor Ragnarok","d261017", "Taika Waititi"  , "26/10/2017");
            clientes[12] = new Cliente(13,"Harry Potter e a Pedra Filosofal","d231101", "Chris Columbus", "23/11/2001");
            clientes[13] = new Cliente(14,"Harry Potter e o Prisioneiro de Askaban","d040604", "Alfons Cuarón"  , "04/06/2004");
            clientes[14] = new Cliente(15,"Harry Potter e o Cálice de Fogo","d251105", "Mike Newell", "25/11/2005");
            clientes[15] = new Cliente(16,"Harry Potter e as Relíquias da Morte 2","d150711", "David Yates"  , "15/07/2011");
            clientes[16] = new Cliente(17,"Assassinato no Expresso do Oriente","d301117", "Kenneth Branagh", "30/11/2017");
            clientes[17] = new Cliente(18,"Dragon Ball Z: A Batalha dos Deuses","d111013", "Masahiro Hosoda"  , "11/10/2013");
            clientes[18] = new Cliente(19,"Dragon Ball Z: O Renascimento de F","d180615", "Tadayoshi Yamamuro", "18/06/2015");
            clientes[19] = new Cliente(20,"Dragon Ball Super: Broly","d141218", "Tatsuya Nagamine"  , "14/12/2018");

        }

        return clientes;
    }

}
