package ru.project.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileWorker {
    private FileWriter writer;
    private FileReader reader;
    private Properties properties;
    private File currentDir;
    private String userName;
    private String userDirHome;

    public FileWorker() {
        this.properties = System.getProperties();
        this.userName = properties.getProperty("user.name");
        this.userDirHome = properties.getProperty("user.home");
    }

    public void makeDir(String dirPath, String newDirName) {
        File newDir = new File(dirPath + "\\" + newDirName);
        boolean created = newDir.mkdir();
        if (created) {
            //setCurrentDir(newDir);
            System.out.println("Каталог " + newDirName + " успешно создан");
        } else {
            System.out.println("Каталог не создан");
        }
    }

    public void makeFile(String filePath, String fileName) {
        File newFile = new File(filePath + "\\" + fileName);
        try {
            boolean created = newFile.createNewFile();
            if (created) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Каталог не создан");
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean isFileExists(String filePath, String fileName) {
        File file = new File(filePath + "\\" + fileName);
        if (file.exists()) {
            System.out.println("Файл " + fileName +" найден");
            return true;
        } else {
            System.out.println("Файл " + fileName +" не найден");
            return false;
        }
    }

    public void renameFile(String currentFilePath, String currentFileName, String newFileName) {
        File currentFile = new File(currentFilePath + "\\" + currentFileName);
        File renamedFile = new File(currentFilePath + "\\" + newFileName);
        if (currentFile.exists() && ((currentFile.isDirectory() && renamedFile.isDirectory())
                || (currentFile.isFile() && renamedFile.isFile()))) {
            currentFile.renameTo(renamedFile);
        }

    }

    public void deleteFile(String filePath, String nameFileToDelete) {
        File fileToDelete = new File(filePath + "\\" + nameFileToDelete);
        if (isFileExists(filePath, nameFileToDelete)) {
            boolean deleted = fileToDelete.delete();
            if (deleted) {
                System.out.println("Файл удален");
            }
        }
    }

    public File[] getFiles(String dirPath) {
        File dir = new File(dirPath);
        File[] list = new File[0];
        if (dir.isDirectory()) {
            list = dir.listFiles();
        }
        return list;
    }

    public String[] getListOfFiles(String dirPath) {
        File dir = new File(dirPath);
        String[] list = new String[0];
        if (dir.isDirectory()) {
            list = dir.list();
        }
        return list;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDirHome() {
        return userDirHome;
    }

    public void setUserDirHome(String userDirHome) {
        this.userDirHome = userDirHome;
    }

    public File getCurrentDir() {
        return currentDir;
    }

    public void setCurrentDir(File currentDir) {
        this.currentDir = currentDir;
    }
}
