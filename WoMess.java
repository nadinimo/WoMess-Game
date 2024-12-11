 
package wo.mess;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author LAYLA
 */
public class WoMess {
private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;
        String nama;
        System.out.println("====================================================");
        System.out.println("                  WO-MESS GAME                      ");
        System.out.println("====================================================");
        System.out.print("\nMasukkan nama anda: ");
        nama = input.nextLine();
        do {
            animasi("   <<< Selamat datang " + nama + " di Game Wo-mess! >>>    ");
            System.out.println("");
            level1();
            level2();
            level3();
            level4();
            level5();
            level6();
            level7();
            level8();
            level9();
            level10();
            System.out.println("Tekan");
            System.out.println("1. Bermain lagi ");
            System.out.println("2. Selesai ");
            pilih = input.nextInt();
        }
        while (pilih == 1);
    }
    
    
    
    public static void level1() {
        String a;
        int tempskor, skor;
        
        skor = 0;
        tempskor = 0;
        String[] b = new String[3];
        int c, e, f, n;
        String[] d = new String[3];
        
        b[0] = "pancake";
        b[1] = "pan";
        b[2] = "cake";
        d[0] = "o";
        d[1] = "oo";
        d[2] = "ooo";
        c = 3;
        f = 0;
        n = 2;
        System.out.println("\nPeraturan bermain: ");
        System.out.println("1. Susunlah kata menggunakan bahasa Inggris");
        System.out.println("2. Jawaban harus huruf kecil");
        while (c > 0) {
            skor = tempskor;
            System.out.println("\n           [ a-n-c-k-p-a-e ]                 ");
            System.out.println("Tersisa " + c + " kata yang harus dimasukkan : ");
            a = input.nextLine();
            if (a.equals(b[0]) || a.equals(b[1]) || a.equals(b[2])) {
                if (!a.equals(d[0]) && !a.equals(d[1]) && !a.equals(d[2])) {
                    c = c - 1;
                    e = c;
                    d[e] = a;
                    System.out.println("Benar ");
                    tempskor = skor + 20;
                    System.out.println("skor anda di level 1: " + tempskor);
                } else {
                    System.out.println("Kata Ini Sudah Terpakai ");
                }
            } else {
                System.out.println("OPSS! Anda salah. Silakan pilih!");
                System.out.println("1. Menyerah (buka kunci jawaban) ");
                System.out.println("2. Coba lagi ");
                f = input.nextInt();
                if (f == 2) {
                } else {
                    c = 0;
                    System.out.println("Kunci Jawaban: ");
                    for (f = 0; f <= n; f++) {
                        System.out.println(b[f]);
                    }
                }
            }
        }
        if (f == n + 1) {
        } else {
            animasi("========== Selamat anda menyelesaikan level 1 =============");
            System.out.println("");
        }
    }
    
    
    
    public static void level2() {
        String a;
        int tempskor, skor;
        
        skor = 0;
        tempskor = 0;
        String[] b = new String[3];
        int c, e, f, n;
        String[] d = new String[3];
        
        b[0] = "pineapple";
        b[1] = "pine";
        b[2] = "apple";
        d[0] = "o";
        d[1] = "oo";
        d[2] = "ooo";
        c = 3;
        f = 0;
        n = 2;
        System.out.println("\nPeraturan bermain: ");
        System.out.println("1. Susunlah kata menggunakan bahasa Inggris");
        System.out.println("2. Jawaban harus huruf kecil");
        while (c > 0) {
            skor = tempskor;
            System.out.println("\n         [ p-a-p-n-e-i-l-p ]                 ");
            System.out.println("Tersisa " + c + " kata yang harus dimasukkan : ");
            a = input.nextLine();
            if (a.equals(b[0]) || a.equals(b[1]) || a.equals(b[2])) {
                if (!a.equals(d[0]) && !a.equals(d[1]) && !a.equals(d[2])) {
                    c = c - 1;
                    e = c;
                    d[e] = a;
                    System.out.println("Benar ");
                    tempskor = skor + 20;
                    System.out.println("skor anda di level 2: " + tempskor);
                } else {
                    System.out.println("Kata Ini Sudah Terpakai ");
                }
            } else {
                System.out.println("\nOPSS! Anda salah. Silakan pilih!");
                System.out.println("1. Menyerah (buka kunci jawaban) ");
                System.out.println("2. Coba lagi ");
                f = input.nextInt();
                if (f == 2) {
                } else {
                    c = 0;
                    System.out.println("Jawaban: ");
                    for (f = 0; f <= n; f++) {
                        System.out.println(b[f]);
                    }
                }
            }
        }
        if (f == n + 1) {
        } else {
            animasi("========== Selamat anda menyelesaikan level 2 =============");
            System.out.println("");
        }
    }
    
    public static void level3() {
        String a;
        int tempskor, skor;
        
        skor = 0;
        tempskor = 0;
        String[] b = new String[3];
        int c, e, f, n;
        String[] d = new String[3];
        
        b[0] = "popcorn";
        b[1] = "pop";
        b[2] = "corn";
        d[0] = "o";
        d[1] = "oo";
        d[2] = "ooo";
        c = 3;
        f = 0;
        n = 2;
        System.out.println("\nPeraturan bermain: ");
        System.out.println("1. Susunlah kata menggunakan bahasa Inggris");
        System.out.println("2. Jawaban harus huruf kecil");
        while (c > 0) {
            skor = tempskor;
            System.out.println("            [ r-o-o-n-p-p-c ]                  ");
            System.out.println("Tersisa " + c + " kata yang harus dimasukkan : ");
            a = input.nextLine();
            if (a.equals(b[0]) || a.equals(b[1]) || a.equals(b[2])) {
                if (!a.equals(d[0]) && !a.equals(d[1]) && !a.equals(d[2])) {
                    c = c - 1;
                    e = c;
                    d[e] = a;
                    System.out.println("Benar ");
                    tempskor = skor + 20;
                    System.out.println("skor anda di level 3: " + tempskor);
                } else {
                    System.out.println("Kata Ini Sudah Terpakai ");
                }
            } else {
                System.out.println("\nOPSS! Anda salah. Silakan pilih!");
                System.out.println("1. Menyerah (buka kunci jawaban) ");
                System.out.println("2. Coba lagi ");
                f = input.nextInt();
                if (f == 2) {
                } else {
                    c = 0;
                    System.out.println("Jawaban: ");
                    for (f = 0; f <= n; f++) {
                        System.out.println(b[f]);
                    }
                }
            }
        }
        if (f == n + 1) {
        } else {
            animasi("========== Selamat anda menyelesaikan level 3 =============");
            System.out.println("");
        }
    }
    
    public static void level4() {
        String a;
        int tempskor, skor;
        
        skor = 0;
        tempskor = 0;
        String[] b = new String[4];
        int c, e, f, n;
        String[] d = new String[4];
        
        b[0] = "butterfly";
        b[1] = "butter";
        b[2] = "fly";
        b[3] = "but";
        d[0] = "o";
        d[1] = "oo";
        d[2] = "ooo";
        d[3] = "oooo";
        c = 4;
        f = 0;
        n = 3;
        System.out.println("\nPeraturan bermain: ");
        System.out.println("1. Susunlah kata menggunakan bahasa Inggris");
        System.out.println("2. Jawaban harus huruf kecil");
        while (c > 0) {
            skor = tempskor;
            System.out.println("         [ u-b-l-t-r-t-e-f-y ]                ");
            System.out.println("Tersisa " + c + " kata yang harus dimasukkan : ");
            a = input.nextLine();
            if (a.equals(b[0]) || a.equals(b[1]) || a.equals(b[2]) || a.equals(b[3])) {
                if (!a.equals(d[0]) && !a.equals(d[1]) && !a.equals(d[2]) && !a.equals(d[3])) {
                    c = c - 1;
                    e = c;
                    d[e] = a;
                    System.out.println("Benar ");
                    tempskor = skor + 20;
                    System.out.println("skor andadi level 4: " + tempskor);
                } else {
                    System.out.println("Kata Ini Sudah Terpakai ");
                }
            } else {
                System.out.println("\nOPSS! Anda salah. Silakan pilih!");
                System.out.println("1. Menyerah (buka kunci jawaban) ");
                System.out.println("2. Coba lagi ");
                f = input.nextInt();
                if (f == 2) {
                } else {
                    c = 0;
                    System.out.println("Jawaban: ");
                    for (f = 0; f <= n; f++) {
                        System.out.println(b[f]);
                    }
                }
            }
        }
        if (f == n + 1) {
        } else {
            animasi("=========== Selamat anda menyelesaikan level 4 ============");
            System.out.println("");
        }
    }
    
    public static void level5() {
        String a;
        int tempskor, skor;
        
        skor = 0;
        tempskor = 0;
        String[] b = new String[4];
        int c, e, f, n;
        String[] d = new String[4];
        
        b[0] = "meatball";
        b[1] = "meat";
        b[2] = "ball";
        b[3] = "eat";
        d[0] = "o";
        d[1] = "oo";
        d[2] = "ooo";
        d[3] = "oooo";
        c = 4;
        f = 0;
        n = 3;
        System.out.println("\nPeraturan bermain: ");
        System.out.println("1. Susunlah kata menggunakan bahasa Inggris");
        System.out.println("2. Jawaban harus huruf kecil");
        while (c > 0) {
            skor = tempskor;
            System.out.println("b-a-l-a-t-e-m-l");
            System.out.println("Tersisa " + c + " kata yang harus dimasukkan");
            a = input.nextLine();
            if (a.equals(b[0]) || a.equals(b[1]) || a.equals(b[2]) || a.equals(b[3])) {
                if (!a.equals(d[0]) && !a.equals(d[1]) && !a.equals(d[2]) && !a.equals(d[3])) {
                    c = c - 1;
                    e = c;
                    d[e] = a;
                    System.out.println("Benar ");
                    tempskor = skor + 20;
                    System.out.println("skor andadi level 5: " + tempskor);
                } else {
                    System.out.println("Kata Ini Sudah Terpakai ");
                }
            } else {
                System.out.println("OPSS! Anda salah. Silakan pilih!");
                System.out.println("1. Menyerah (buka kunci jawaban) ");
                System.out.println("2. Coba lagi ");
                f = input.nextInt();
                if (f == 2) {
                } else {
                    c = 0;
                    System.out.println("Jawaban:");
                    for (f = 0; f <= n; f++) {
                        System.out.println(b[f]);
                    }
                }
            }
        }
        if (f == n + 1) {
        } else {
            animasi("============ Selamat anda menyelesaikan level 5 ===========");
            System.out.println("");
        }
    }
    
    public static void level6() {
        String a;
        int tempskor, skor;
        
        skor = 0;
        tempskor = 0;
        String[] b = new String[5];
        int c, e, f, n;
        String[] d = new String[5];
        
        b[0] = "boyfriend";
        b[1] = "boy";
        b[2] = "friend";
        b[3] = "end";
        b[4] = "fry";
        d[0] = "o";
        d[1] = "oo";
        d[2] = "ooo";
        d[3] = "oooo";
        d[4] = "ooooo";
        c = 5;
        f = 0;
        n = 4;
        System.out.println("Peraturan bermain: ");
        System.out.println("1. Susunlah kata menggunakan bahasa Inggris");
        System.out.println("2. Jawaban harus huruf kecil");
        while (c > 0) {
            skor = tempskor;
            System.out.println("           [ d-r-o-f-b-y-e-i-n ]                ");
            System.out.println("Tersisa " + c + " kata yang harus dimasukkan : ");
            a = input.nextLine();
            if (a.equals(b[0]) || a.equals(b[1]) || a.equals(b[2]) || a.equals(b[3]) || a.equals(b[4])) {
                if (!a.equals(d[0]) && !a.equals(d[1]) && !a.equals(d[2]) && !a.equals(d[3]) && !a.equals(d[4])) {
                    c = c - 1;
                    e = c;
                    d[e] = a;
                    System.out.println("Benar ");
                    tempskor = skor + 20;
                    System.out.println("skor andadi level 6: " + tempskor);
                } else {
                    System.out.println("Kata Ini Sudah Terpakai ");
                }
            } else {
                System.out.println("OPSS! Anda salah. Silakan pilih!");
                System.out.println("1. Menyerah (buka kunci jawaban) ");
                System.out.println("2. Coba lagi ");
                f = input.nextInt();
                if (f == 2) {
                } else {
                    c = 0;
                    System.out.println("Jawaban: ");
                    for (f = 0; f <= n; f++) {
                        System.out.println(b[f]);
                    }
                }
            }
        }
        if (f == n + 1) {
        } else {
            animasi("Selamat anda menyelesaikan level 6");
            System.out.println("");
        }
    }
    
    public static void level7() {
        String a;
        int tempskor, skor;
        
        skor = 0;
        tempskor = 0;
        String[] b = new String[5];
        int c, e, f, n;
        String[] d = new String[5];
        
        b[0] = "extraordinary";
        b[1] = "extra";
        b[2] = "ordinary";
        b[3] = "diary";
        b[4] = "tar";
        d[0] = "o";
        d[1] = "oo";
        d[2] = "ooo";
        d[3] = "oooo";
        d[4] = "ooooo";
        c = 5;
        f = 0;
        n = 4;
        System.out.println("Peraturan bermain: ");
        System.out.println("1. Susunlah kata menggunakan bahasa Inggris");
        System.out.println("2. Jawaban harus huruf kecil");
        while (c > 0) {
            skor = tempskor;
            System.out.println("        [ d-r-y-i-a-o-a-x-r-e-t-n-r ]          ");
            System.out.println("Tersisa " + c + " kata yang harus dimasukkan : ");
            a = input.nextLine();
            if (a.equals(b[0]) || a.equals(b[1]) || a.equals(b[2]) || a.equals(b[3]) || a.equals(b[4])) {
                if (!a.equals(d[0]) && !a.equals(d[1]) && !a.equals(d[2]) && !a.equals(d[3]) && !a.equals(d[4])) {
                    c = c - 1;
                    e = c;
                    d[e] = a;
                    System.out.println("Benar ");
                    tempskor = skor + 20;
                    System.out.println("skor andadi level 7: " + tempskor);
                } else {
                    System.out.println("Kata Ini Sudah Terpakai ");
                }
            } else {
                System.out.println("OPSS! Anda salah. Silakan pilih!");
                System.out.println("1. Menyerah (buka kunci jawaban) ");
                System.out.println("2. Coba lagi ");
                f = input.nextInt();
                if (f == 2) {
                } else {
                    c = 0;
                    System.out.println("Jawaban: ");
                    for (f = 0; f <= n; f++) {
                        System.out.println(b[f]);
                    }
                }
            }
        }
        if (f == n + 1) {
        } else {
            animasi("Selamat anda menyelesaikan level 7");
            System.out.println("");
        }
    }
    
    public static void level8() {
        String a;
        int tempskor, skor;
        
        skor = 0;
        tempskor = 0;
        String[] b = new String[6];
        int c, e, f, n;
        String[] d = new String[6];
        
        b[0] = "playground";
        b[1] = "play";
        b[2] = "ground";
        b[3] = "lay";
        b[4] = "loud";
        b[5] = "god";
        d[0] = "o";
        d[1] = "oo";
        d[2] = "ooo";
        d[3] = "oooo";
        d[4] = "ooooo";
        d[5] = "oooooo";
        c = 6;
        f = 0;
        n = 5;
        System.out.println("Peraturan bermain: ");
        System.out.println("1. Susunlah kata menggunakan bahasa Inggris");
        System.out.println("2. Jawaban harus huruf kecil");
        while (c > 0) {
            skor = tempskor;
            System.out.println("         [ u-o-a-l-p-y-d-r-g-n ]               ");
            System.out.println("Tersisa " + c + " kata yang harus dimasukkan : ");
            a = input.nextLine();
            if (a.equals(b[0]) || a.equals(b[1]) || a.equals(b[2]) || a.equals(b[3]) || a.equals(b[4]) || a.equals(b[5])) {
                if (!a.equals(d[0]) && !a.equals(d[1]) && !a.equals(d[2]) && !a.equals(d[3]) && !a.equals(d[4]) && !a.equals(d[5])) {
                    c = c - 1;
                    e = c;
                    d[e] = a;
                    System.out.println("Benar ");
                    tempskor = skor + 20;
                    System.out.println("skor anda di level 8: " + tempskor);
                } else {
                    System.out.println("Kata Ini Sudah Terpakai ");
                }
            } else {
                System.out.println("OPSS! Anda salah. Silakan pilih!");
                System.out.println("1. Menyerah (buka kunci jawaban) ");
                System.out.println("2. Coba lagi ");
                f = input.nextInt();
                if (f == 2) {
                } else {
                    c = 0;
                    System.out.println("Jawaban: ");
                    for (f = 0; f <= n; f++) {
                        System.out.println(b[f]);
                    }
                }
            }
        }
        if (f == n + 1) {
        } else {
            animasi("Selamat anda menyelesaikan level 8");
            System.out.println("");
        }
    }
    
    public static void level9() {
        String a;
        int tempskor, skor;
        
        skor = 0;
        tempskor = 0;
        String[] b = new String[6];
        int c, e, f, n;
        String[] d = new String[6];
        
        b[0] = "strawberry";
        b[1] = "straw";
        b[2] = "berry";
        b[3] = "raw";
        b[4] = "star";
        b[5] = "try";
        d[0] = "o";
        d[1] = "oo";
        d[2] = "ooo";
        d[3] = "oooo";
        d[4] = "ooooo";
        d[5] = "oooooo";
        c = 6;
        f = 0;
        n = 5;
        System.out.println("Peraturan bermain: ");
        System.out.println("1. Susunlah kata menggunakan bahasa Inggris");
        System.out.println("2. Jawaban harus huruf kecil");
        while (c > 0) {
            skor = tempskor;
            System.out.println("          [ w-a-r-t-e-b-r-y-r-s ]              ");
            System.out.println("Tersisa " + c + " kata yang harus dimasukkan : ");
            a = input.nextLine();
            if (a.equals(b[0]) || a.equals(b[1]) || a.equals(b[2]) || a.equals(b[3]) || a.equals(b[4]) || a.equals(b[5])) {
                if (!a.equals(d[0]) && !a.equals(d[1]) && !a.equals(d[2]) && !a.equals(d[3]) && !a.equals(d[4]) && !a.equals(d[5])) {
                    c = c - 1;
                    e = c;
                    d[e] = a;
                    System.out.println("Benar ");
                    tempskor = skor + 20;
                    System.out.println("skor anda di level 9: " + tempskor);
                } else {
                    System.out.println("Kata Ini Sudah Terpakai ");
                }
            } else {
                System.out.println("OPSS! Anda salah. Silakan pilih!");
                System.out.println("1. Menyerah (buka kunci jawaban) ");
                System.out.println("2. Coba lagi ");
                f = input.nextInt();
                if (f == 2) {
                } else {
                    c = 0;
                    System.out.println("Jawaban: ");
                    for (f = 0; f <= n; f++) {
                        System.out.println(b[f]);
                    }
                }
            }
        }
        if (f == n + 1) {
        } else {
            animasi("Selamat anda menyelesaikan level 9");
            System.out.println("");
        }
    }
    public static void level10() {
        String a;
        int tempskor, skor;
        
        skor = 0;
        tempskor = 0;
        String[] b = new String[7];
        int c, e, f, n;
        String[] d = new String[7];
        
        b[0] = "watermelon";
        b[1] = "water";
        b[2] = "melon";
        b[3] = "lemon";
        b[4] = "rate";
        b[5] = "meal";
        b[6] = "one";
        d[0] = "o";
        d[1] = "oo";
        d[2] = "ooo";
        d[3] = "oooo";
        d[4] = "ooooo";
        d[5] = "oooooo";
        d[6] = "ooooooo";
        c = 6;
        f = 0;
        n = 5;
        System.out.println("\nPeraturan bermain: ");
        System.out.println("1. Susunlah kata menggunakan bahasa Inggris");
        System.out.println("2. Jawaban harus huruf kecil");
        while (c > 0) {
            skor = tempskor;
            System.out.println("\n         [ e-m-r-e-t-o-a-w-l-n ]            ");
            System.out.println("Tersisa " + c + " kata yang harus dimasukkan : ");
            a = input.nextLine();
            if (a.equals(b[0]) || a.equals(b[1]) || a.equals(b[2]) || a.equals(b[3]) || a.equals(b[4]) || a.equals(b[5])) {
                if (!a.equals(d[0]) && !a.equals(d[1]) && !a.equals(d[2]) && !a.equals(d[3]) && !a.equals(d[4]) && !a.equals(d[5])) {
                    c = c - 1;
                    e = c;
                    d[e] = a;
                    System.out.println("Benar ");
                    tempskor = skor + 20;
                    System.out.println("skor andadi level 10: " + tempskor);
                } else {
                    System.out.println("Kata Ini Sudah Terpakai ");
                }
            } else {
                System.out.println("OPSS! Anda salah. Silakan pilih!");
                System.out.println("1. Menyerah (buka kunci jawaban) ");
                System.out.println("2. Coba lagi ");
                f = input.nextInt();
                if (f == 2) {
                } else {
                    c = 0;
                    System.out.println("Jawaban: ");
                    for (f = 0; f <= n; f++) {
                        System.out.println(b[f]);
                    }
                }
            }
        }
        if (f == n + 1) {
        } else {
            animasi("============ Selamat anda menyelesaikan level 9 ==========");
            System.out.println("");
        }
    }
    public static void animasi(String teks) {
        int i;
        
        for (i = 0; i <= teks.length() - 1; i++) {
            System.out.print(teks.charAt(i));
            delay(1000);
        }
        System.out.print("");
    }
    
    public static void delay(int waktu) {
        while (waktu > 0) {
            waktu = waktu - 1;
        }
    }
}

    
    

