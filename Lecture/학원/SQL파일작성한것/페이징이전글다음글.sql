select * from tb_bbs_article;

select @rnum := 0;
  

delete from tb_bbs_article where articleno in ( 200, 199);
  
select @rnum := @rnum+1 , a.articleno articleno
  from tb_bbs_article a, (select @rnum := 0 ) b
  order by articleno desc;
  

-- getArticleList 
SELECT articleno, title, regdate, hit, attachfileNum, commentNum 
        FROM (
            SELECT @RNUM := @RNUM + 1 AS r, a.* 
            FROM (
                    SELECT a.articleno articleno, 
                           a.title, 
                           a.regdate, 
                           a.hit, 
                           count(distinct(f.attachfileno)) attachfileNum, 
                           count(distinct(c.commentno)) commentNum
                    FROM 
                        TB_BBS_Article a
                        LEFT OUTER JOIN TB_BBS_Attachfile f ON a.articleno = f.articleno
                        LEFT OUTER JOIN TB_BBS_Comments   c ON a.articleno = c.articleno
                    WHERE
                        a.boardcd = 'free'
                    GROUP BY a.articleno, title, a.regdate, hit
                    ORDER BY articleno DESC
                 ) a, (SELECT @RNUM:=0) b
            ) temp
        WHERE r BETWEEN 11 AND 20
        
        
-- getNextArticle 다음글
SELECT articleno, title
        FROM
        (
            SELECT @RNUM := @RNUM + 1 AS r,a.*
            FROM
                (SELECT articleno, title 
                   FROM TB_BBS_Article 
                  WHERE boardcd      =    'free'
                    AND articleno   >  186
                    
                    ORDER BY articleno ASC
                ) a
                , (SELECT @RNUM:=0) b
        ) c
        WHERE r = 1
        
        
-- getPrevArticle 이전글
SELECT articleno, title
        FROM
        (
            SELECT @RNUM := @RNUM + 1 AS r,a.*
            FROM
            (SELECT articleno, title 
               FROM TB_BBS_Article 
              WHERE boardcd     =    'free' 
                AND articleno  <  186

                ORDER BY articleno DESC
            ) a
            , (SELECT @RNUM:=0) b
        ) c
        WHERE r = 1
        
        
        
-- 
INSERT INTO tb_bbs_board (boardcd , boardnm , UseYN )
VALUES ('val1_1', 'val1_2',  1  )
     , ('val2_1', 'val2_2',  1  )
     , ('val3_1', 'val3_2',  1  ) ;
