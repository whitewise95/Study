package step8_03.atm_v3.copy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileManager {
	
		private FileManager() {};
		public static FileManager getInstance() {
			return instance;
		}
		public static void setInstance(FileManager instance) {
			FileManager.instance = instance;
		}
		private static FileManager instance = new FileManager();
	
		UserManager userManager = UserManager.getInstance();
		String fileName = "ATMv3.txt";
		
		
		boolean loadData() {
			
			boolean isFinsh = false;
			
			File file =new File(fileName);
			FileReader fr =null;
			BufferedReader br = null;
			
			if(file.exists()) {
				userManager.user = null;
				
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					
					String strCnt = br.readLine();
					int count = Integer.parseInt(strCnt);
					
					userManager.user = new User[count];
					userManager.userCnt = 0;
					
					while(true) {
						String line = br.readLine();
						if(line==null)break;
						
						String[] info = line.split("/");
						int size = info.length;
						
						User user = null;
						if(size == 3) {
							user = new User(info[0],info[1],null,0);
						}
						else {
							String id = info[0];
							String pw = info[1];
							int accCount = Integer.parseInt(info[2]);
							Account[] accList = new Account[accCount];
							int j = 3;
							for (int i = 0; i < accCount; i++) {
								accList[i] = new Account();
								accList[i].acc = info[j];
								accList[i].money =Integer.parseInt(info[j+1]);
								j +=2;
								
							}
							user = new User(id,pw,accList,accCount);
						}
						userManager.user[userManager.userCnt] = user;
						userManager.userCnt++; 		
						
					}
					isFinsh = true;
					System.out.println("파일을 로드했습니다.\n");
					
				} catch (Exception e) {e.printStackTrace();}
					finally {try {br.close();} catch (IOException e) {e.printStackTrace();
							}finally {try {fr.close();} catch (IOException e) {e.printStackTrace();
						}
					}
				}	
			}
			return isFinsh;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		void saveData() {
			UserManager userManager = UserManager.getInstance();
			if (userManager.userCnt== 0) return;
			else {
					String data = "";
					
					data += userManager.userCnt;
					data += "\n";
					for (int i = 0; i < userManager.userCnt; i++) {
						data+=  userManager.user[i].id; data+= "/";
						data+=  userManager.user[i].pw; data+= "/";
						data+=  userManager.user[i].accCnt;
						if(userManager.user[i].accCnt>0) {
							data +="/";
							for (int j = 0; j < userManager.user[i].accCnt; j++) {
								data+=  userManager.user[i].accList[j].acc; 
								data+=  userManager.user[i].accList[j].money; 
								if(j!=userManager.user[i].accCnt-1) {
									data+= "/";
								}
							}
						}
						else if(i!=userManager.userCnt-1){
							data+="/n";
						}
					}
					FileWriter fw = null;
					try {
						 fw = new FileWriter(fileName);
						 fw.write(data);
						 
					} catch (IOException e) {e.printStackTrace();}
					  finally {try {fw.close();} catch (IOException e) {e.printStackTrace();}
					  }
			}
		}
	
	

}
