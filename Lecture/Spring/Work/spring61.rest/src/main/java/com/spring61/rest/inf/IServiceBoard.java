package com.spring61.rest.inf;

import java.util.List;
import java.util.Map;

import com.spring61.rest.model.ModelArticle;


public interface IServiceBoard extends IBoard {
    
    ModelArticle transArticle(int articleno);
    int transDeleteArticle(int articleno);

    /*
	public int getListNo();
	
	public int getPrevLink();
	
	public int getFirstPage();
	
	public int getLastPage();
	
	public int getNextLink();

	public int[] getPageLinks();

	public PagingHelper getPagingHelper();

	public void setPagingHelper(PagingHelper pagingHelper);
	*/
}
