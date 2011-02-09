package com.tapestry5inaction.tlog.blogroll.pages;


import com.tapestry5inaction.tlog.annotations.PluginPage;
import com.tapestry5inaction.tlog.blogroll.entities.ExternalBlog;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

@PluginPage
public class EditExternalBlog {

    @Property
    private ExternalBlog blog;

    @Inject
    private Session session;

    @CommitAfter
    void onSuccess() {
        session.save(blog);
    }
}
