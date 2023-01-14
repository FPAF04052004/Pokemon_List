package Application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Entities.Pokemon;
import Entities.Types;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ArrayList<Pokemon> list = new ArrayList<Pokemon>();
		
		System.out.println("Deseja adicionar um novo Pokemon?");
		char novo = sc.next().charAt(0);
		
		while(novo == 'y') {
			System.out.println("Numero do pokemon:");
			Integer number = sc.nextInt();
			System.out.println("Nome do pokemon:");
			String name = sc.nextLine();
			System.out.println("Vida:");
			Integer HP = sc.nextInt();
			System.out.println("Ataque:");
			Integer attack = sc.nextInt();
			System.out.println("Defesa:");
			Integer defense = sc.nextInt();
			System.out.println("Ataque especial:");
			Integer spAttack = sc.nextInt();
			System.out.println("Defesa especial:");
			Integer  spDefense = sc.nextInt();
			System.out.println("Velocidade:");
			Integer speed = sc.nextInt();
			System.out.println("Tipo:");
			Types type = Types.valueOf(sc.next());
			System.out.println("O pokemon tem um sub-tipo?");
			char sub = sc.next().charAt(0);
			
			if(sub == 'y') {
				System.out.println("Sub-Tipo:");
				Types subType = Types.valueOf(sc.next());
				if(type.equals(subType)) {
					System.out.println("Erro: Sub-tipo igual ao tipo.");
					System.out.println("Sub-Tipo:");
					subType = Types.valueOf(sc.next());
				}else {
					list.add(new Pokemon(name, number, HP, attack, defense, spAttack, spDefense, speed, type, subType));
				}
			}else {
				list.add(new Pokemon(name, number, HP, attack, defense, spAttack, spDefense, speed, type));
			}
			
			System.out.println("Deseja adicionar um novo Pokemon?");
			novo = sc.next().charAt(0);
		}
		
		sc.close();
	}

}
