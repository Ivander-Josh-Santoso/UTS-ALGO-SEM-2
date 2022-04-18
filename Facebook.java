//21090069_IVANDER JOSH SANTOSO_2B
//Method memposting Array Model 

import java.util.ArrayList;
import java.util.Scanner;

public class Facebook {
    public static void main(String[] args) {
        Facebook_Model[] post = new Facebook_Model[3];
        post[0] = new Facebook_Model();
        post[0].user = "Spark AR Creator Days Workshop";
        post[0].foto = """
            https://www.facebook.co/.../g.28975505981.../952025685487854
                ⠐⣄⡀⢀⢀⢰⣶⣶⣶⣶⣶⣦⣄⁣
                ⢀⠘⢿⣦⣄⢸⣿⣿⡟⠛⣿⣿⣿⡆⁣
                ⢀⣴⣾⣿⡿⢠⣌⡛⠇⢰⣿⣿⡿⠃⁣
                ⢀⣿⣿⣿⣄⣸⣿⣿⡆⠘⢿⣿⡄⁣
                ⢀⠙⠿⢿⣿⣿⣿⣿⡇⢀⢀⠈⠻⢆⁣""";
        post[0].caption = """
                
                """;
        ArrayList komen0 = new ArrayList<>();
        post[0].komen = komen0;
        post[0].like = 0;
        post[0].link = "http://instagram/annur/post0";

       
     

        System.out.println("INSTAGRAM");
        System.out.println("---------------");
        System.out.println("\nPostingan 1");
        post[0].post();
        

        Scanner input = new Scanner(System.in);
        char pilihPost = 0;
        do {
            System.out.println("Pilih Postingan (1, 2, 3): ");
            pilihPost = input.next().charAt(0);
            switch (pilihPost) {
                case '1' -> {
                    post[0].postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[0].likes(1);
                                post[0].postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[0].Comments(komen);
                                post[0].postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[0].showComment();
                            }
                            case '4' -> {
                                System.out.println("Link Tersalin: " + post[0].link);
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                case '2' -> {
                    post[1].postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[1].likes(1);
                                post[1].postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[1].Comments(komen);
                                post[1].postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[1].showComment();
                            }
                            case '4' -> {
                                System.out.println("Link Tersalin: " + post[1].link);
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                case '3' -> {
                    post[2].postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[2].likes(1);
                                post[2].postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[2].Comments(komen);
                                post[2].postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[2].showComment();
                            }
                            case '4' -> {
                                System.out.println("Link Tersalin: " + post[2].link);
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
            }
        } while (pilihPost != '0');
    }
}
