
CREATE TABLE cartorio (
    name VARCHAR(100) UNIQUE,
    address VARCHAR(255) NOT NULL,
    city VARCHAR(25) NOT NULL,
    state VARCHAR(25) NOT NULL,
    uuid CHAR(36) PRIMARY KEY
);

CREATE TABLE certidoes (
    uuid CHAR(36) PRIMARY KEY,
    code INTEGER NOT NULL,
    name VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE emissores (
    cartorio_uuid CHAR(36),
    certidoes_uuid CHAR(36),
    PRIMARY KEY (cartorio_uuid, certidoes_uuid),
    FOREIGN KEY (cartorio_uuid) REFERENCES cartorio(uuid),
    FOREIGN KEY (certidoes_uuid) REFERENCES certidoes(uuid)
);