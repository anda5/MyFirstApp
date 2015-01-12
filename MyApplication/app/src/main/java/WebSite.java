/**
 * Created by anda on 1/12/2015.
 */
public class WebSite {

        private int _id;
        private String _title;
        private  String _description;
        private String  _siteLink;
        private String  _feedLink;

        public  WebSite(){
        }

        public WebSite(String title,String description,String siteLink,String feedLink){
            _title=title;
            _description=description;
            _siteLink=siteLink;
            _feedLink=feedLink;
        }
        public WebSite(WebSite webSite){
            super();
            _id= webSite._id;
        }
        public int getId() {
            return _id;
        }
        public String getTitle(){
            return _title;
        }
        public String getDescription(){
            return _description;
        }
        public String getSiteLink(){
            return _siteLink;
        }
        public String getFeedLink(){
            return _feedLink;
        }
        public void setId(int _id) {
            this._id = _id;
        }
        public void setTitle(String _title){
            this._title=_title;
        }
        public void setDescription(String _description){
            this._description=_description;
        }
        public void setSitelink(String _siteLink){
            this._siteLink=_siteLink;
        }
        private void setFeedLink(String _feedLink){
            this._feedLink=_feedLink;
        }

    }















