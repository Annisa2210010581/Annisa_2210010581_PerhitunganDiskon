/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Annisa
 * 2210010581
 */
public class AplikasiDiskonHelper {
        public static double calculateTotal(double hargaPerUnit, int qty, double diskon) {
        double total = hargaPerUnit * qty;
        double jmlDiskon = total * (diskon / 100);
        return total - jmlDiskon;
    }
}
