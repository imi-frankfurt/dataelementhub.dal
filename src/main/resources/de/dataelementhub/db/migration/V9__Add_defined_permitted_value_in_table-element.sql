ALTER TABLE "element"
ADD COLUMN defined_permitted_value text;

ALTER TABLE "element"
ADD CONSTRAINT defined_check CHECK (((element_type <> 'DEFINED_VALUE_DOMAIN'::element_type) OR
                                 ((format IS NOT NULL) AND (datatype IS NOT NULL) AND
                                  (maximum_characters IS NOT NULL))))

