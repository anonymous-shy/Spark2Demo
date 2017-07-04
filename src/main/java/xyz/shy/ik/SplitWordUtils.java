package xyz.shy.ik;

import org.apache.commons.lang3.StringUtils;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by Shy on 2017/6/27.
 */
public class SplitWordUtils {

    public static String ikSplit(String str) {
        String result = "";
        if (StringUtils.isEmpty(str)) {
            return result;
        }
        try {
            byte[] bt = str.getBytes();
            InputStream is = new ByteArrayInputStream(bt);
            Reader reader = new InputStreamReader(is);
            IKSegmenter ikSegmenter = new IKSegmenter(reader, true);
            Lexeme t;
            while ((t = ikSegmenter.next()) != null) {
                result += t.getLexemeText() + " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
