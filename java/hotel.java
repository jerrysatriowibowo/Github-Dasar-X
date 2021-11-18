String nama = "", kamar = "";
            int jenis = 0, status = 0, lama = 0, tarif = 0;
            double diskon = 0, bayar = 0;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // input
            do {
            System.out.println("\t\t--*-- SISTEM INFORMASI PERHOTELAN --*--");
            System.out.println();
            System.out.print("\tNama Pelanggan \t\t\t: ");
            nama = br.readLine();

            System.out.println("\n\tPilih Jenis Kamar");
            System.out.println("\t1. Deluxe Room Rp 275.000/hari");
            System.out.println("\t2. Suite Room Rp 300.000/hari");
            System.out.println("\t3. President Room Rp 370.000/hari");
            System.out.print("\tJenis kamar yang dipesan \t: ");
            jenis = Integer.parseInt(br.readLine());

            System.out.print("\n\tLama Menginap \t\t\t: ");
            lama = Integer.parseInt(br.readLine());

            System.out.println("\n\tStatus Pelanggan");
            System.out.println("\t1. Member");
            System.out.println("\t2. Non Member");
            System.out.print("\tPilih status pelanggan \t\t: ");
            status = Integer.parseInt(br.readLine());

            // proses perhitungan
            if (Jenis == 1) {
                Tarif = lama * 275000;
                Kamar = "Deluxe Room";
            } else if (Jenis == 2) {
                Tarif = lama * 300000;
                Kamar = "Suite Room";
            } else if (jenis == 3) {
                Tarif = lama * 375000;
                Kamar = "President Room";
            }

            if (status == 1) {
                if (lama >= 4 && lama <= 7) {
                    diskon = 0.20 * tarif;
                } else if (lama > 7) {
                    diskon = 0.35 * tarif;
                }
            } else if (status == 2) {
                if (lama >= 4 && lama <= 7) {
                    diskon = 0.10 * tarif;
                } else if (lama > 7) {
                    diskon = 0.15 * tarif;
                }
            }

            bayar = tarif - diskon;

            // output
            System.out.println("\n\n\t---*--- NOTA PEMBAYARAN HOTEL BANDUNG ---*---");
            System.out.println("\tNama Pelanggan \t\t\t: " + nama);
            System.out.println("\tJenis Kamar \t\t\t: " + kamar);
            System.out.println("\tTarif Penginapan \t\t: Rp " + tarif + ",-");
            System.out.println("\tDiskon Menginap \t\t: Rp " + diskon + ",-");
            System.out.println("\tNominal yang harus dibayar \t: Rp " + bayar + ",-");
            System.out.print("\tBayar \t\t\t\t: Rp ");
            double yar = Integer.parseInt(br.readLine());
            if (yar < bayar) {
                System.out.println("\tMohon maaf uang anda kurang");
            } else {
                double kembalian = yar - bayar;
                System.out.println("\tKembalian anda \t\t\t: Rp " + kembalian + ",-");
            }
            System.out.println("\t====================================================");
            System.out.println();