package sess03_selection_and_iteration;

/**
 * Java program to search for some text in a paragraph sing a while loop
 * @author Administrator
 */
public class TextSearch {
    
    // main method begins program execution
    public static void main(String[] args) {
        // paragrapgh to search text within
        String paragraph = """
        Both the Themes gallery and the Quick Styles gallery provide reset commands so that you can always 
        restore the look of your document to the original contained in your current template. On the Insert 
        tab, the galleries include items that are designed to coordinate with the overall look of your document. 
        You can use these galleries to insert tables, headers, footers, lists, cover pages, and other document 
        building blocks. When you create pictures, charts, or diagrams, they also coordinate with your current 
        document look. You can easily change the formatting of selected text in the document text by choosing a look 
        for the selected text from the Quick Styles gallery on the Home tab. You can also format text directly by using 
        the other controls on the Home tab. Most controls offer a choice of using the look from the current theme or 
        using a format that you specify directly. To change the overall look of your document, choose new Theme elements 
        on the Page Layout tab.
                           """;
        
        // word/text t search for
        String textToSearch = "ADSE2501";
        boolean found = false; // variable to indicate whether the text has been found or not
        
        int index = 0;
        // Use a while loop to search for the text
        while(index < paragraph.length())
        {
            // Check if substring matches 
            if(index + textToSearch.length() <= paragraph.length() 
                    && paragraph.substring(index, index + textToSearch.length()).equals(textToSearch))
            {
                found = true;
                break; // Exit the loop when the text is found
            }
            index++; // increment the index to check the next character
        }
        // Output the results
        if(found)
        {
            System.out.println("The text/word '" + textToSearch + "' was found at index " + index);
        }
        else
        {
            System.out.println("Unfortunately the text/word '" + textToSearch + "' was not found in the paragraph");
        }
        
    }
}
