package mvnro;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class Download {
public static void main(String[] args) throws IOException, IOException {
	Scanner myObj = new Scanner(System.in);
	System.out.println("Do not Exit");
	String userName = System.getProperty("user.name");
	System.out.println("Downloading Google Chrome...");
	FileUtils.copyURLToFile(
			
			  new URL("https://redirector.gvt1.com/edgedl/release2/chrome/VM7AZGvxTD3eRDzvxYLSvg_86.0.4240.75/86.0.4240.75_chrome_installer.exe"), 
			  new File("C:/Users/"+ userName + "/Downloads//Chrome.exe"), 
			  100000, 
			  700000);
	System.out.println("Downloaded Google Chrome");
	System.out.println("Downloading Winrar");
	FileUtils.copyURLToFile(
			
			  new URL("https://www.rarlab.com/rar/winrar-x64-610b3.exe"), 
			  new File("C:/Users/"+ userName+ "/Downloads//Winrar.exe"), 
			  100000, 
			  700000);
	System.out.println("Downloaded Winrar");
	System.out.println("Downloding Powerdvd");
	FileUtils.copyURLToFile(
			
			  new URL("https://github.com/Roheith-P/Download/raw/main/CyberLink_PowerDVD_Downloader.exe"), 
			  new File("C:/Users/"+ userName+ "/Downloads//Powerdvd.exe"), 
			  100000, 
			  700000);
	System.out.println("Downloaded Powerdvd");
	System.out.println("Downloding Yiddly Youtube Downloader");
	FileUtils.copyURLToFile(
			
			  new URL("https://get.vidd.ly/builds/5.0.336/ViddlySetup.exe"), 
			  new File("C:/Users/"+ userName+ "/Downloads//Yiddly.exe"), 
			  100000, 
			  700000);
	System.out.println("Downloaded Yiddly");
	System.out.println("All Files are Downloaded To Downloads Folder");
	System.out.println("Press Enter to Exit");
	String exit = myObj.nextLine();
}
}
