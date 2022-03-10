package com.study.util;

import net.coobird.thumbnailator.Thumbnails;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @project: thumbnailator
 * @ClassName: ThumbnailatorUtil
 * @author: Qin Wei Chang
 * @creat: 2022/3/8 3:57 下午
 * 描述:Thumbnailator is a thumbnail generation library for Java.
 */
public class ThumbnailatorUtil {



    public static void main(String[] args) throws IOException {
        long time = new Date().getTime();
     //   System.out.println(time);
        String pdfFilePath = "/Users/qin/java/workspace/study/thumbnailator/doc/img_1.png";
        String eimRealPath = "/Users/qin/java/workspace/study/thumbnailator/doc/img_1-Thumbnailator.jpeg";

        BufferedImage originalImage = ImageIO.read(new File(pdfFilePath));

       /* BufferedImage thumbnail = Thumbnails.of(originalImage)
                .scale(0.5)
               .asBufferedImage();*/
        //thumbnail.flush();

        Thumbnails.of(originalImage)
                .scale(0.7).outputFormat("jpeg")
                .toFile(eimRealPath);
        long time1 = new Date().getTime();


    }


}
