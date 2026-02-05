import java.util.Arrays;

public class Dijkstra {
    // Inti Algoritma Dijkstra
    static int[] dijkstra(int[][] graf, int sumber) {
        int n = graf.length;
        
        // 1. Inisialisasi jarak
        int[] jarak = new int[n];
        boolean[] selesai = new boolean[n];
        
        // Set semua jarak = 999999 (tak hingga), kecuali sumber = 0
        for (int i = 0; i < n; i++) {
            jarak[i] = 999999;
        }
        jarak[sumber] = 0;
        
        // 2. Loop untuk semua vertex
        for (int count = 0; count < n; count++) {
            
            // 3. Cari vertex dengan jarak minimum yang belum selesai
            int u = -1;
            int minJarak = 999999;
            for (int i = 0; i < n; i++) {
                if (!selesai[i] && jarak[i] < minJarak) {
                    minJarak = jarak[i];
                    u = i;
                }
            }
            
            // Tandai vertex u sebagai selesai
            selesai[u] = true;
            
            // 4. Update jarak ke semua tetangga vertex u
            for (int v = 0; v < n; v++) {
                // Jika ada edge dari u ke v dan v belum selesai
                if (graf[u][v] > 0 && !selesai[v]) {
                    int jarakBaru = jarak[u] + graf[u][v];
                    
                    // 5. Jika jalur baru lebih pendek, update
                    if (jarakBaru < jarak[v]) {
                        jarak[v] = jarakBaru;
                    }
                }
            }
        }
        
        return jarak;
    }
    
    public static void main(String[] args) {
        // Graf dalam bentuk adjacency matrix
        // 0 = tidak ada edge, angka lain = bobot edge
        int[][] graf = {
            {0, 4, 8, 0, 0},  // vertex 0
            {4, 0, 0, 0, 6},  // vertex 1  
            {8, 0, 0, 2, 0},  // vertex 2
            {0, 0, 2, 0, 10}, // vertex 3
            {0, 6, 0, 10, 0}  // vertex 4
        };
        
        int sumber = 0;
        int[] hasil = dijkstra(graf, sumber);
        
        // Cetak hasil
        System.out.println("Jarak terpendek dari vertex " + sumber + ":");
        for (int i = 0; i < hasil.length; i++) {
            System.out.println("ke vertex " + i + ": " + hasil[i]);
        }
    }
}