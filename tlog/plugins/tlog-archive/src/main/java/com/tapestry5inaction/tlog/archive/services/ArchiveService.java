package com.tapestry5inaction.tlog.archive.services;


import com.tapestry5inaction.tlog.entities.Archive;

import java.util.List;

public interface ArchiveService {

    List<Archive> findArchives();
}