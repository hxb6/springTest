package test.xmlParsingTest;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

/**
 * @Package: test.xmlParsingTest
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/17 17:01
 * @Description:
 **/
public class DOMParsing {

    public static String xmlPath = "src\\main\\resource\\xmlTest.xml";

    /**
     * 添加节点测试
     * @param document 文档对象
     */
    public static void addNode(Document document) throws TransformerException {
        //获取文档根目录
        Element root = document.getDocumentElement();

        //文档创建节点 addTest
        Element addTest = document.createElement("addTest");
        //设置addTest节点属性
        addTest.setAttribute("id", "yy");
        //文档创建节点 add
        Element add = document.createElement("add");
        //设置add节点内容
        add.setTextContent("添加测试");
        //将add节点作为子节点加入到addTest节点中
        addTest.appendChild(add);
        //将addTest节点加入到文档根节点中
        root.appendChild(addTest);
        //保存文档对象
        saveXml(document);
    }

    /**
     * 删除节点测试
     * @param document
     */
    public static void deleteNode(Document document) throws TransformerException {
        //获取文档根目录
        Element root = document.getDocumentElement();
        //获取需要删除的节点
        Node linkman = root.getElementsByTagName("linkman").item(1);
        //从根节点中删除节点
        root.removeChild(linkman);
        //保存文档对象
        saveXml(document);
    }

    /**
     * 修改节点测试
     * @param document 文档对象
     */
    public static void updateNode(Document document) throws TransformerException {
        //获取文档根目录
        Element root = document.getDocumentElement();
        //需要进行修改的节点
        Element linkman = (Element) root.getElementsByTagName("linkman").item(0);
        //增加属性
        linkman.setAttribute("id", "修改测试");
        //修改linkman节点下的email子节点值
        Node email = linkman.getElementsByTagName("email").item(0);
        email.setTextContent("update@qq.com");
        //保存文档对象
        saveXml(document);
    }

    /**
     * 保存文档对象
     * @param document 文档对象
     */
    public static void saveXml(Document document) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        Transformer transformer = transformerFactory.newTransformer();

        transformer.transform(new DOMSource(document), new StreamResult(new File(xmlPath)));
    }


    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {

        //创建文档解析工厂
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        //由文档解析工厂生成文档解析对象
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        //由文档解析对象解析指定的xml文件，得到文档对象Document
        Document document = documentBuilder.parse(xmlPath);

        //addNode(document);

        //deleteNode(document);

        updateNode(document);

    }

}
