CREATE TABLE code_system
(
    id SERIAL PRIMARY KEY,
    version TEXT,
    source_id  INTEGER   NOT NULL,
    created_by INTEGER,
    created_at timestamp NOT NULL DEFAULT current_timestamp,
    CONSTRAINT code_system_source_id_version_key UNIQUE (source_id, version),
    CONSTRAINT source_id_fkey FOREIGN KEY (source_id) REFERENCES source (id) ON DELETE CASCADE
);

CREATE TABLE value_domain_reference (
    subset_uri TEXT,
    scopedidentifier_id INTEGER       NOT NULL,
    created_by          INTEGER       NOT NULL,
    created_at          timestamp     NOT NULL DEFAULT current_timestamp,
    code_system_id INTEGER NOT NULL,
    CONSTRAINT code_system_id_fkey FOREIGN KEY (code_system_id) REFERENCES code_system (id) ON DELETE CASCADE,
    CONSTRAINT value_domain_reference_pkey PRIMARY KEY (code_system_id, scopedidentifier_id)

);