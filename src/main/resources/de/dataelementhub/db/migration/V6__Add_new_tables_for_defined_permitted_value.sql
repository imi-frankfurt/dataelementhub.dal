CREATE TABLE value_domain_defined_permissible_value
(
    value_domain_scoped_identifier_id      INTEGER not null,
    defined_permissible_value_scoped_identifier_id INTEGER not null
);

ALTER TABLE value_domain_defined_permissible_value
    ADD FOREIGN KEY (value_domain_scoped_identifier_id) references scoped_identifier (id) ON DELETE CASCADE;
ALTER TABLE value_domain_defined_permissible_value
    ADD FOREIGN KEY (defined_permissible_value_scoped_identifier_id) references scoped_identifier (id) ON DELETE CASCADE;