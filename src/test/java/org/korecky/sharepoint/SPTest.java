package org.korecky.sharepoint;

import org.korecky.sharepoint.net.HttpProxy;
import java.io.File;
import org.korecky.sharepoint.authentication.NtlmAuthenticator;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.apache.commons.lang3.StringUtils;
import static org.junit.Assert.*;
import org.junit.Test;
import org.xml.sax.SAXException;

/**
 *
 * @author vkorecky
 */
public class SPTest {

    public SPTest() {
    }

    @Test
    public void complexTest() throws MalformedURLException, NoSuchAlgorithmException, KeyManagementException, ParseException, IOException, URISyntaxException, SAXException, JAXBException, ParserConfigurationException, TransformerConfigurationException, TransformerException {
        
//        if ((result != null) && (result.size() > 0)) {
//            SPWeb web = result.get(0);
//            System.out.println(web.getUrl());
//            // SPAlert                
//            List<SPAlert> alertCollection = web.getAlerts();
//            assertNotNull(alertCollection);
//            // Web properties
//            Map<String, String> webProperties = web.getAllProperties();
//            assertNotNull(webProperties);
//            // Lists
//            List<SPList> lists = web.getLists();
//            assertNotNull(lists);
//            for (SPList list : lists) {
//                System.out.println(list.getTitle());
//                // List items in list
//                if (StringUtils.equals(list.getTitle(), "test2")) {
//                    System.out.println(list.getTitle());
//                    List<SPFile> items = list.getFiles();
//                    if (items != null) {
//                        for (SPFile item : items) {
//                            System.out.println(item.getCreated() + " " + item.getName());
//                        }
//                    }
//                }
//            }
//            
//            
//            if ((lists != null) && (lists.size() > 0)) {
//                SPList list = lists.get(0);
//                // List views
//                List<SPView> views = list.getViews();
//
//                // List items in document library
//                list = lists.get(3);
//                System.out.println(list.getTitle());
//                items = list.getItems();
//                File savedFile = null;
//                for (SPListItem item : items) {
//                    savedFile = new File("c:\\Users\\vkorecky\\workspace\\" + item.getFile().getName());
//                    item.getFile().saveBinary(savedFile);
//                }
//
//                // List items with attachements
//                list = lists.get(34);
//                System.out.println(list.getTitle());
//                items = list.getItems();
//                for (SPListItem item : items) {
//                    // Attachements                    
//                    for (SPAttachment attachement : item.getAttachments()) {
//                        File file = new File("c:\\Users\\vkorecky\\workspace\\" + attachement.getName());
//                        attachement.saveBinary(file);
//                    }
//
//                    SPAttachment attachment = item.addAttachment(savedFile);
//                    System.out.println(attachment.getAbsoluteUrl());
//                }
//            }
//
//            // ListTemplates
//            List<SPListTemplate> templates = web.getListTemplates();
//            assertNotNull(templates);
//            // web.addList("test3", "pokus", templates.get(1));                                 
//        }
    }
}
