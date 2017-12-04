SELECT articleno, title
        FROM
        (
            SELECT @RNUM := @RNUM + 1 AS r,a.*
            FROM
                (SELECT articleno, title 
                   FROM TB_BBS_Article 
                  WHERE boardcd      =    'free' 
                    AND articleno   &gt;  1
                    ORDER BY articleno ASC
                ) a
                , (SELECT @RNUM:=0) b
        ) c
        WHERE r = 1