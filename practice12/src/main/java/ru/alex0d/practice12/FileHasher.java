package ru.alex0d.practice12;

import jakarta.annotation.PreDestroy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class FileHasher implements CommandLineRunner {
    private File inputFile;
    private File outputFile;

    @Override
    public void run(String... args) throws Exception {
        inputFile = new File(args[0]);
        outputFile = new File(args[1]);
        hashFile();
    }

    private void hashFile() throws IOException, NoSuchAlgorithmException {
        String content = readFile();
        if (content == null) {
            writeToFile("null");
        } else {
            String hashedContent = hashContent(content);
            writeToFile(hashedContent);
        }
    }

    private String readFile() throws IOException {
        if (!inputFile.exists()) {
            return null;
        }
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line = reader.readLine();
        reader.close();
        return line;
    }

    private String hashContent(String content) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(content.getBytes());
        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }

    private void writeToFile(String content) throws IOException {
        if (outputFile.exists()) {
            outputFile.delete();
        }
        outputFile.createNewFile();
        FileOutputStream out = new FileOutputStream(outputFile);
        out.write(content.getBytes());
        out.close();
    }


    @PreDestroy
    private void destroy() {
        inputFile.delete();
    }
}
