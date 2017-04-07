package org.carlspring.strongbox.services;

import org.carlspring.strongbox.storage.search.SearchRequest;
import org.carlspring.strongbox.storage.search.SearchResults;

import java.io.IOException;

import org.apache.lucene.queryparser.classic.ParseException;

/**
 * @author mtodorov
 */
public interface ArtifactSearchService
{

    SearchResults search(SearchRequest searchRequest)
            throws IOException, ParseException;

    boolean contains(SearchRequest searchRequest)
            throws IOException, ParseException;

}
