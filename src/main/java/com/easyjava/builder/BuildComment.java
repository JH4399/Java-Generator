package com.easyjava.builder;

import com.easyjava.bean.Constants;
import com.easyjava.utils.DateUtils;

import java.io.BufferedWriter;
import java.util.Date;

/**
 * 构建注释
 */
public class BuildComment {

    /**
     * 构建类注释
     */
    public static void createClassComment(BufferedWriter bw, String classComment) throws Exception {
        bw.write("/**");
        bw.newLine();
        bw.write(" * @Description:" + classComment);
        bw.newLine();
        bw.write(" * @auther:" + Constants.AUTHER_COMMENT);
        bw.newLine();
        bw.write(" * @date:" + DateUtils.format(new Date(), DateUtils._YYYYMMDD));
        bw.newLine();
        bw.write(" */");
        bw.newLine();
    }

    /**
     * 构建属性注释
     */
    public static void createFieldComment(BufferedWriter bw, String fieldComment) throws Exception {
        bw.write("\t/**");
        bw.newLine();
        bw.write("\t * " + (fieldComment == null ? "" : fieldComment));
        bw.newLine();
        bw.write("\t */");
        bw.newLine();
    }

    /**
     * 构建方法注释
     */
    public static void createMethodComment() {

    }

}
