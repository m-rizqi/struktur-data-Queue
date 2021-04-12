import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		int data;
        Queue queue = new Queue();
        Scanner input = new Scanner(System.in);
        boolean exit = true;
		while (exit) {
			menu();
			System.out.print("Menu yang dipilih : ");
			int in = input.nextInt();
			switch (in) {
				case 1:
					System.out.println("\n=========================");
					System.out.println("| T A M B A H   D A T A |");
					System.out.println("=========================");
                    System.out.print("| Masukkan data : ");
					data = input.nextInt();
					queue.enQueue(data);
					System.out.println();
					break;
			
				case 2:
					System.out.println("\n=========================");
					System.out.println("|  A M B I L   D A T A  |");
					System.out.println("=========================");
					data = queue.deQueue();
					if (data != -1) {
						System.out.println("| Data = "+data+"\n");
					} else {
						System.err.println("!-- Queue Kosong --!\n");
					}
					break;
			
				case 3:
					System.out.println("\n=========================");
					System.out.println("| D A T A  P E R T A M A |");
					System.out.println("=========================");
					data = queue.peek();
					if (data != -1) {
						System.out.println("| Data = " + data + "\n");
					} else {
						System.err.println("!-- Queue Kosong --!\n");
					}
					break;
			
				case 4:
					System.out.println("\n=========================");
					System.out.println("|  S E M U A   D A T A  |");
					System.out.println("=========================");
                    queue.show();
					break;
			
				case 5:
					System.out.println("\n=========================");
					System.out.println("|   B U A T   B A R U   |");
					System.out.println("=========================");
					queue.clear();
					System.out.println("<-- Queue berhasil dibuat -->");
					System.out.println("Silahkan menambahkan data melalui menu no. 1\n");
					break;
			
				case 6:
					exit = false;
					break;
			
				default:
					System.err.println("\n<-- input salah -->");
					break;
			}
		}
	}

	private static void menu(){
		System.out.println("=========================");
		System.out.println("|        M E N U        |");
		System.out.println("=========================");
		System.out.println("|1.| Tambah Data        |");
		System.out.println("|2.| Ambil Data         |");
		System.out.println("|3.| Lihat Data Pertama |");
		System.out.println("|4.| Lihat Semua Data   |");
		System.out.println("|5.| Buat Queue Baru    |");
		System.out.println("|6.| Keluar             |");
	}

}
