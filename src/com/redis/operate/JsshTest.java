package com.redis.operate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.swing.filechooser.FileSystemView;

import com.sshtools.j2ssh.SshClient;
import com.sshtools.j2ssh.authentication.AuthenticationProtocolState;
import com.sshtools.j2ssh.authentication.PasswordAuthenticationClient;
import com.sshtools.j2ssh.sftp.SftpFile;

public class JsshTest {
	

	public static void main(String[] args) {
		
		SshClient client=new SshClient();
        try{
            client.connect("135.251.147.210");
            //设置用户名和密码
            PasswordAuthenticationClient pwd = new PasswordAuthenticationClient();
            pwd.setUsername("root");
            pwd.setPassword("Password");
            int result=client.authenticate(pwd);
            if(result==AuthenticationProtocolState.COMPLETE){//如果连接完成
                System.out.println("==============="+result);
                List<SftpFile> list = client.openSftpClient().ls("/mnt/vran_release/user/pbshen/");
                for (SftpFile f : list) {
                    System.out.println(f.getFilename());  
                    System.out.println(f.getAbsolutePath());                   
                    if(f.getFilename().equals("ue.log")){
                        //OutputStream os = new FileOutputStream("d://tmp//"+f.getFilename());
                    	
                    	File desktopDir = FileSystemView.getFileSystemView().getHomeDirectory();
                        String desktopPath = desktopDir.getAbsolutePath();// 得到桌面路径
                        File file = new File(desktopPath + "//ue.log");
                        if (file.exists()) {
                            System.out.print("文件存在");
                        } else {
                            System.out.print("文件不存在");
                            file.createNewFile();// 不存在则创建
                        }
                        OutputStream os = new FileOutputStream(file);
                        client.openSftpClient().get("/mnt/vran_release/user/pbshen/ue.log", os);
                        //以行为单位读取文件start
                        BufferedReader reader = null;
                        try {
                            System.out.println("以行为单位读取文件内容，一次读一整行：");
                            reader = new BufferedReader(new FileReader(file));
                            String tempString = null;
                            String endString=null;
                            int line = 1;//行号
                            //一次读入一行，直到读入null为文件结束
                            while ((tempString = reader.readLine()) != null) {
                                //显示行号
                            	endString=tempString;
                                System.out.println("line " + line + ": " + tempString);
                                line++;
                            }
                            reader.close();
                            System.out.println("HelloWorld"+endString);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            if (reader != null) {
                                try {
                                    reader.close();
                                } catch (IOException e1) {
                                }
                            }
                        }
                        //以行为单位读取文件end
                    }
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

	}

}
