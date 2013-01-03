package client;

public final class DVD{
    private String title;

    public DVD() {
        this(ResourceBundle.getString(DVDResources.UNTITLED));
    }
    public DVD(final String title) {
        super();
        this.title = title;
    }
   
    public String getTitle() {
         return title;  
    }
    public void setTitle(String title) {
        if (! this.title.equals(ResourceBundle.getString(DVDResources.UNTITLED))) {
            throw new IllegalStateException(ResourceBundle.getString(DVDResources.TITLE_ERROR));
        }
        this.title = title;
    }   
}
