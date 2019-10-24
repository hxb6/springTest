package test.xmlParsingTest;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @Package: test.xmlParsingTest
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/21 10:27
 * @Description:
 **/
public class MyDefaultHandler extends DefaultHandler {

    /**
     * 读到稳定开始时调用
     * @throws SAXException
     */
    @Override
    public void startDocument() throws SAXException {
        System.out.println("文档开始");
    }

    /**
     * 读到文档结束时调用
     * @throws SAXException
     */
    @Override
    public void endDocument() throws SAXException {
        System.out.println("文档结束");
    }

    /**
     * 读到标签开始时调用
     * @param uri xml文档的命名空间
     * @param localName 标签的名字
     * @param qName 带命名空间的标签名字
     * @param attributes 标签的属性集
     * @throws SAXException
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("标签开始-----" + qName);
    }

    /**
     * 读到标签结束时调用
     * @param uri
     * @param localName
     * @param qName
     * @throws SAXException
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("标签结束-----" + qName);
    }

    /**
     * 读到文本内容时调用
     * @param ch 当前读取到的TextNode(文本节点)的字节数组
     * @param start 字节开始的位置，为0则读取全部
     * @param length 当前TextNode的长度
     * @throws SAXException
     */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String content = new String(ch, start, length);
        System.out.println("内容-----" + content);
    }
}
