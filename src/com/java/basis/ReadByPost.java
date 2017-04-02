package com.java.basis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * @date 2015-05-30
 *
 */
public class  ReadByPost {

	public static void main(String[] args) {
		new post().start();
	}
}
class post extends Thread{
	@Override
	public void run() {
		try {
			URL url = new URL("http://fanyi.youdao.com/openapi.do");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.addRequestProperty("encoding", "UTF-8");
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			OutputStream os = connection.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("keyfrom=mytestdghszg&key=704515641&type=data&doctype=xml&version=1.1&q=welcome");
			bw.flush();
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line;
			StringBuilder sb = new StringBuilder();
			while ((line= br.readLine())!=null) {
				sb.append(line);
			}
			br.close();
			isr.close();
			is.close();
			bw.close();
			osw.close();
			os.close();
			System.out.println(sb.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}



	}
}
