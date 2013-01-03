package client;

public final class DVD{
    private final String title;

    public DVD() {
       this(getResourceString(DVDResources.UNTITLED));
    }
    public DVD(final String title) {
        super();
        this.title = title;
    }
   
    private static String getResourceString(final String title) {
      ResourceBundle.getString(title);
    }

    public String getTitle() {
         return title;  
    }

   public void setTitle(String title) {
        if (! this.title.equals(getResourceString(DVDResources.UNTITLED))) {
            throw new IllegalStateException(getResourceString(DVDResources.TITLE_ERROR));
        }
        this.title = title;
    }
}
