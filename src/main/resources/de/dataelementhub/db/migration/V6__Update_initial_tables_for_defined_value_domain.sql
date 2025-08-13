ALTER TABLE "element"
ADD COLUMN defined_permitted_value text;
ADD CONSTRAINT def_check CHECK (((element_type <> 'DEFINED_VALUE_DOMAIN'::element_type) OR
                                 ((format IS NOT NULL) AND (datatype IS NOT NULL) AND
                                  (maximum_characters IS NOT NULL))))

CREATE TABLE value_domain_defined_permissible_value
(
    value_domain_scoped_identifier_id      INTEGER not null,
    defined_permissible_value_scoped_identifier_id INTEGER not null
);

ALTER TABLE value_domain_defined_permissible_value
    ADD FOREIGN KEY (value_domain_scoped_identifier_id) references scoped_identifier (id) ON DELETE CASCADE;
ALTER TABLE value_domain_defined_permissible_value
    ADD FOREIGN KEY (defined_permissible_value_scoped_identifier_id) references scoped_identifier (id) ON DELETE CASCADE;