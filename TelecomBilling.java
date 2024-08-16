/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.telecombilling;

/**
 *
 * @author odong
 */
class TelecomBilling {
    public static void main(String[] args) {
        // Define constants
        final double AIRTIME_LOAD = 10000; // UGX
        final double CHARGE_PERCENTAGE = 0.10; // 10%
        final int CALL_DURATION_SECONDS = 5 * 60; // 5 minutes in seconds
        final double CALL_RATE_PER_SECOND = 200; // UGX

        // Calculate the total charge for airtime and call
        double chargeForAirtime = AIRTIME_LOAD * CHARGE_PERCENTAGE;
        double totalCallCharge = CALL_DURATION_SECONDS * CALL_RATE_PER_SECOND;
        double initialBalance = AIRTIME_LOAD;

        // Calculate the remaining balance
        double remainingBalance = initialBalance - chargeForAirtime - totalCallCharge;

        // Print the results
        System.out.println("Initial balance: UGX " + initialBalance);
        System.out.println("Charge for airtime: UGX " + chargeForAirtime);
        System.out.println("Total call charge: UGX " + totalCallCharge);
        System.out.println("Remaining balance: UGX " + remainingBalance);
    }
}


