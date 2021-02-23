package com.sambad.model;

import android.widget.LinearLayout;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Resp {

    private String date;

    private String template;

    private _links _links;

    private String link;

    private String type;

    private Title title;

    private Content content;

    private String featured_media;

    private String modified;

    private String id;

    private String[] categories;

    private String post_views;

    private String date_gmt;

    private String slug;

    private String modified_gmt;

    private String author;

    private String format;

    private String comment_status;

    private String[] tags;

    private String ping_status;

    private String[] meta;

    private String sticky;

    private Guid guid;

    private Better_featured_image better_featured_image;

    private Excerpt excerpt;

    private String status;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public _links get_links() {
        return _links;
    }

    public void set_links(_links _links) {
        this._links = _links;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getFeatured_media() {
        return featured_media;
    }

    public void setFeatured_media(String featured_media) {
        this.featured_media = featured_media;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String getPost_views() {
        return post_views;
    }

    public void setPost_views(String post_views) {
        this.post_views = post_views;
    }

    public String getDate_gmt() {
        return date_gmt;
    }

    public void setDate_gmt(String date_gmt) {
        this.date_gmt = date_gmt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getModified_gmt() {
        return modified_gmt;
    }

    public void setModified_gmt(String modified_gmt) {
        this.modified_gmt = modified_gmt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getComment_status() {
        return comment_status;
    }

    public void setComment_status(String comment_status) {
        this.comment_status = comment_status;
    }

    public String[] getMeta() {
        return meta;
    }

    public void setMeta(String[] meta) {
        this.meta = meta;
    }

    public String getPing_status() {
        return ping_status;
    }

    public void setPing_status(String ping_status) {
        this.ping_status = ping_status;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getSticky() {
        return sticky;
    }

    public void setSticky(String sticky) {
        this.sticky = sticky;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public Better_featured_image getBetter_featured_image() {
        return better_featured_image;
    }

    public void setBetter_featured_image(Better_featured_image better_featured_image) {
        this.better_featured_image = better_featured_image;
    }

    public Excerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public class _links {

        private List<Curies> curiesList;

        private List<Replies> repliesList;

        @SerializedName("version-history")
        private List<Versionhistory> versionhistory;

        private List<Author> authorList;

        private List<About> aboutList;

        private List<Self> selfList;

        private List<Collection> collectionList;

        public List<Curies> getCuries() {
            return curiesList;
        }

        public void setCuries(List<Curies> curies) {
            this.curiesList = curies;
        }

        public List<Replies> getReplies() {
            return repliesList;
        }

        public void setReplies(List<Replies> replies) {
            this.repliesList = replies;
        }

        public List<Versionhistory> getVersionhistory() {
            return versionhistory;
        }

        public void setVersionhistory(List<Versionhistory> versionhistory1) {
            this.versionhistory = versionhistory1;
        }

        public List<Author> getAuthor() {
            return authorList;
        }

        public void setAuthor(List<Author> author) {
            this.authorList = author;
        }

        public List<About> getAbout() {
            return aboutList;
        }

        public void setAbout(List<About> about) {
            this.aboutList = about;
        }

        public List<Self> getSelf() {
            return selfList;
        }

        public void setSelf(List<Self> self) {
            this.selfList = self;
        }

        public List<Collection> getCollection() {
            return collectionList;
        }

        public void setCollection(List<Collection> collection) {
            this.collectionList = collection;
        }
    }

    public class Curies {

        private String templated;

        private String name;

        private String href;

        public String getTemplated() {
            return templated;
        }

        public void setTemplated(String templated) {
            this.templated = templated;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public class Wpterm {
        private String taxonomy;

        private String href;

        private String embeddable;

        public String getTaxonomy() {
            return taxonomy;
        }

        public void setTaxonomy(String taxonomy) {
            this.taxonomy = taxonomy;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(String embeddable) {
            this.embeddable = embeddable;
        }

    }

    public class Wpattachment {
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public class Wpfeaturedmedia {
        private String href;

        private String embeddable;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(String embeddable) {
            this.embeddable = embeddable;
        }
    }

    public class Versionhistory {
        private String count;

        private String href;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public class Replies {
        private String href;

        private String embeddable;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(String embeddable) {
            this.embeddable = embeddable;
        }
    }

    public class Author {
        private String href;

        private String embeddable;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(String embeddable) {
            this.embeddable = embeddable;
        }
    }

    public class About {
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public class Collection {
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public class Self {
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public class Better_featured_image {
        private String post;

        private String alt_text;

        private String media_type;

        private String caption;

        private String description;

        private String id;

        private Media_details media_details;

        private String source_url;

        public String getPost() {
            return post;
        }

        public void setPost(String post) {
            this.post = post;
        }

        public String getAlt_text() {
            return alt_text;
        }

        public void setAlt_text(String alt_text) {
            this.alt_text = alt_text;
        }

        public String getMedia_type() {
            return media_type;
        }

        public void setMedia_type(String media_type) {
            this.media_type = media_type;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Media_details getMedia_details() {
            return media_details;
        }

        public void setMedia_details(Media_details media_details) {
            this.media_details = media_details;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }
    }

    public class Media_details {
        private String file;

        private Sizes sizes;

        private Image_meta image_meta;

        private String width;

        private String height;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Sizes getSizes() {
            return sizes;
        }

        public void setSizes(Sizes sizes) {
            this.sizes = sizes;
        }

        public Image_meta getImage_meta() {
            return image_meta;
        }

        public void setImage_meta(Image_meta image_meta) {
            this.image_meta = image_meta;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }
    }

    public class Image_meta {
        private String aperture;

        private String copyright;

        private String orientation;

        private String focal_length;

        private String iso;

        private String[] keywords;

        private String caption;

        private String created_timestamp;

        private String credit;

        private String camera;

        private String title;

        private String shutter_speed;

        public String getAperture() {
            return aperture;
        }

        public void setAperture(String aperture) {
            this.aperture = aperture;
        }

        public String getCopyright() {
            return copyright;
        }

        public void setCopyright(String copyright) {
            this.copyright = copyright;
        }

        public String getOrientation() {
            return orientation;
        }

        public void setOrientation(String orientation) {
            this.orientation = orientation;
        }

        public String getFocal_length() {
            return focal_length;
        }

        public void setFocal_length(String focal_length) {
            this.focal_length = focal_length;
        }

        public String getIso() {
            return iso;
        }

        public void setIso(String iso) {
            this.iso = iso;
        }

        public String[] getKeywords() {
            return keywords;
        }

        public void setKeywords(String[] keywords) {
            this.keywords = keywords;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getCreated_timestamp() {
            return created_timestamp;
        }

        public void setCreated_timestamp(String created_timestamp) {
            this.created_timestamp = created_timestamp;
        }

        public String getCredit() {
            return credit;
        }

        public void setCredit(String credit) {
            this.credit = credit;
        }

        public String getCamera() {
            return camera;
        }

        public void setCamera(String camera) {
            this.camera = camera;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getShutter_speed() {
            return shutter_speed;
        }

        public void setShutter_speed(String shutter_speed) {
            this.shutter_speed = shutter_speed;
        }
    }

    public class Sizes {

        @SerializedName("publisher-tb1")
        private Publishertb1 publishertb1;

        private Thumbnail thumbnail;

        @SerializedName("publisher-sm")
        private Publishersm publishersm;

        @SerializedName("publisher-mg2")
        private Publishermg2 publishermg2;

        @SerializedName("publisher-md")
        private Publishermd publishermd;

        @SerializedName("publisher-tall-lg")
        private Publishertalllg publishertalllg;

        @SerializedName("publisher-tall-sm")
        private Publishertallsm publishertallsm;

        private Medium medium;

        @SerializedName("publisher-tall-big")
        private Publishertallbig publishertallbig;

        public Publishertb1 getPublishertb1() {
            return publishertb1;
        }

        public void setPublishertb1(Publishertb1 publishertb1) {
            this.publishertb1 = publishertb1;
        }

        public Thumbnail getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(Thumbnail thumbnail) {
            this.thumbnail = thumbnail;
        }

        public Publishersm getPublishersm() {
            return publishersm;
        }

        public void setPublishersm(Publishersm publishersm) {
            this.publishersm = publishersm;
        }

        public Publishermg2 getPublishermg2() {
            return publishermg2;
        }

        public void setPublishermg2(Publishermg2 publishermg2) {
            this.publishermg2 = publishermg2;
        }

        public Publishermd getPublishermd() {
            return publishermd;
        }

        public void setPublishermd(Publishermd publishermd) {
            this.publishermd = publishermd;
        }

        public Publishertalllg getPublishertalllg() {
            return publishertalllg;
        }

        public void setPublishertalllg(Publishertalllg publishertalllg) {
            this.publishertalllg = publishertalllg;
        }

        public Publishertallsm getPublishertallsm() {
            return publishertallsm;
        }

        public void setPublishertallsm(Publishertallsm publishertallsm) {
            this.publishertallsm = publishertallsm;
        }

        public Medium getMedium() {
            return medium;
        }

        public void setMedium(Medium medium) {
            this.medium = medium;
        }

        public Publishertallbig getPublishertallbig() {
            return publishertallbig;
        }

        public void setPublishertallbig(Publishertallbig publishertallbig) {
            this.publishertallbig = publishertallbig;
        }

    }

    public class Publishertallbig {
        private String file;

        @SerializedName("mime-type")
        private String mimetype;

        private String width;

        private String source_url;

        private String height;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getMimetype() {
            return mimetype;
        }

        public void setMimetype(String mimetype) {
            this.mimetype = mimetype;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }
    }

    public class Publishertalllg {
        private String file;

        @SerializedName("mime-type")
        private String mimetype;

        private String width;

        private String source_url;

        private String height;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getMimetype() {
            return mimetype;
        }

        public void setMimetype(String mimetype) {
            this.mimetype = mimetype;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }
    }

    public class Publishertallsm {

        private String file;

        @SerializedName("mime-type")
        private String mimetype;

        private String width;

        private String source_url;

        private String height;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getMimetype() {
            return mimetype;
        }

        public void setMimetype(String mimetype) {
            this.mimetype = mimetype;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }
    }

    public class Publishermd {
        private String file;

        @SerializedName("mime-type")
        private String mimetype;

        private String width;

        private String source_url;

        private String height;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getMimetype() {
            return mimetype;
        }

        public void setMimetype(String mimetype) {
            this.mimetype = mimetype;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

    }

    public class Publishermg2 {

        private String file;

        @SerializedName("mime-type")
        private String mimetype;

        private String width;

        private String source_url;

        private String height;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getMimetype() {
            return mimetype;
        }

        public void setMimetype(String mimetype) {
            this.mimetype = mimetype;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }
    }

    public class Publishersm {
        private String file;

        @SerializedName("mime-type")
        private String mimetype;

        private String width;

        private String source_url;

        private String height;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getMimetype() {
            return mimetype;
        }

        public void setMimetype(String mimetype) {
            this.mimetype = mimetype;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }
    }

    public class Publishertb1 {

        private String file;

        @SerializedName("mime-type")
        private String mimetype;

        private String width;

        private String source_url;

        private String height;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getMimetype() {
            return mimetype;
        }

        public void setMimetype(String mimetype) {
            this.mimetype = mimetype;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

    }

    public class Thumbnail {

        private String file;

        @SerializedName("mime-type")
        private String mimetype;

        private String width;

        private String source_url;

        private String height;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getMimetype() {
            return mimetype;
        }

        public void setMimetype(String mimetype) {
            this.mimetype = mimetype;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

    }

    public class Medium {

        private String file;

        @SerializedName("mime-type")
        private String mimetype;

        private String width;

        private String source_url;

        private String height;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getMimetype() {
            return mimetype;
        }

        public void setMimetype(String mimetype) {
            this.mimetype = mimetype;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

    }

    public class Excerpt {
        private String rendered;

        @SerializedName("protected")
        private String protected1;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public String getProtected() {
            return protected1;
        }

        public void setProtected(String protected11) {
            this.protected1 = protected11;
        }

    }

    public class Content {
        private String rendered;

        @SerializedName("protected")
        private String protected1;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public String getProtected() {
            return protected1;
        }

        public void setProtected(String protected11) {
            this.protected1 = protected11;
        }
    }

    public class Title {
        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

    }

    public class Guid {
        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }
    }

}
