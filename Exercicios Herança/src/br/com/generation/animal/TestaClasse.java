package br.com.generation.animal;

public class TestaClasse {

    public static void main(String[] args) {

        Cachorro dog = new Cachorro();
        Cavalo horse = new Cavalo();
        Preguica preg = new Preguica();

        dog.setNome("Rufus");
        dog.setIdade(3);
        dog.setSom("Latir...");
        dog.setAcao("Correr...");

        horse.setNome("P�-de-pano");
        horse.setIdade(20);
        horse.setSom("Relinchar...");
        horse.setAcao("Correr");

        preg.setNome("Orivaldo");
        preg.setIdade(20);
        preg.setSom("Gritar...");
        preg.setAcao("Escalar �rvore... ");

        System.out.println("Nome do cachorro: "+dog.getNome());
        System.out.println("Idade do cachorro: "+dog.getIdade());
        System.out.println("Som do Cachorro: "+dog.getSom());
        System.out.println("A��o do Cachorro:"+dog.getAcao());
        System.out.println();

        System.out.println("Nome do cavalo: "+horse.getNome());
        System.out.println("Idade do cavalo: "+horse.getIdade());
        System.out.println("Som do cavalo: "+horse.getSom());
        System.out.println("A��o do cavao: "+horse.getAcao());
        System.out.println("");

        System.out.println("Nome da pregui�a: "+preg.getNome());
        System.out.println("Idade do pregui�a: "+preg.getIdade());
        System.out.println("Som da pregui�a: "+preg.getSom());
        System.out.println("A��o da pregui�a: "+preg.getAcao());

    }

}