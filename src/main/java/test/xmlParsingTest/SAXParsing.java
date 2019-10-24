package test.xmlParsingTest;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * @Package: test.xmlParsingTest
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/17 17:01
 * @Description:
 **/
public class SAXParsing {

    public static String xmlPath = "src\\main\\resource\\xmlTest.xml";
    /**
     * 解析xml文件
     */
    public static void readXml() throws Exception {
        //得到SAX解析工厂
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        //由SAX解析工厂生成一个SAX解析器
        SAXParser saxParser = saxParserFactory.newSAXParser();
        //参数一：xml文档文件，文件输入流或资源路径
        //参数儿：DefaultHandler的子类   MyDefaultHandler()为自定义
        saxParser.parse(xmlPath, new MyDefaultHandler());

    }

    public static void main(String[] args) throws Exception {
        readXml();
    }
}
