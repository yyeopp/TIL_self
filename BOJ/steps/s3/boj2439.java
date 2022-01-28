package steps.s3;

import java.io.*;

public class boj2439 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T;

		try {
			T = Integer.parseInt(br.readLine());

			String[][] star = new String[T][T];
			for (int i = 0; i < T; i++) {
				for (int j = 0; j < T; j++) {
					if (T-i-1 <= j) {
						star[i][j] = "*";
					}
					if (T-i-1 > j) {
						star[i][j] = " ";
					}

				}

			}
			for (int i = 0; i < T; i++) {
				for (int j = 0; j < T; j++) {
					bw.write(star[i][j]);

				}
				if (i < T - 1) {
					bw.write("\n");
				}
			}
			bw.flush();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
