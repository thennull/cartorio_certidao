
-- Cartórios dataset

INSERT INTO cartorio VALUES (
    'cart1',
    'R. José Bragança,365',
    'Itabira',
    'Minas Gerais',
    '6582a627-8c1d-403b-bb2b-77e17e3f80ed'
    );

INSERT INTO cartorio VALUES (
    'cart2',
    'Avenida Vila Lobos',
    'Belo Horizonte',
    'Minas Gerais',
    '87efe7a2-164f-4ddb-a9ad-01f572eade95'
    );
INSERT INTO cartorio VALUES (
    'cart3',
    'R. José Bragança,365',
    'São Paulo',
    'São Paulo',
    '439fbf8d-dc54-448f-b3d9-aacf601adf80'
    );

INSERT INTO cartorio VALUES (
    'cart4',
    'R. José Bragança,365',
    'Campinas',
    'São Paulo',
    '15068440-cafe-4c6d-a59e-82d47b844666'
    );

INSERT INTO cartorio VALUES (
    'cart5',
    'R. José Bragança,365',
    'Niteroi',
    'Rio de Janeiro',
    '8035d47a-ef60-4281-8565-3b0a8fe88567'
    );

INSERT INTO cartorio VALUES (
    'cart6',
    'R. José Bragança,365',
    'Itabira',
    'Minas Gerais',
    'fb8595cb-2975-4323-8503-372e54171f62'
    );

INSERT INTO cartorio VALUES (
    'cart7',
    'R. José Bragança,365',
    'Belo Horizonte',
    'Minas Gerais',
    'e1dc3bb1-b01b-4d82-b015-69ab5b6f3745'
    );

INSERT INTO cartorio VALUES (
    'cart8',
    'R. José Bragança,365',
    'Caratinga',
    'Minas Gerais',
    'f830779d-9e4b-40c9-b033-24fe29cc082f'
    );


-- Certidões dataset

INSERT INTO certidoes (uuid, code, name) VALUES (
    'ea6f1275-2c3f-414a-8476-5436a48dccba',
    1,
    'Casamento'
);

INSERT INTO certidoes (uuid, code, name) VALUES (
    '89991a13-105e-4217-be45-24b37061b067',
    2,
    'Nascimento'
);

INSERT INTO certidoes (uuid, code, name) VALUES (
    'a90d8604-a827-4c5e-bdf1-bfdfd33a6ccd',
    3,
    'Obito'
);


-- Emissores dataset

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    '6582a627-8c1d-403b-bb2b-77e17e3f80ed',
    '89991a13-105e-4217-be45-24b37061b067'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    '6582a627-8c1d-403b-bb2b-77e17e3f80ed',
    'ea6f1275-2c3f-414a-8476-5436a48dccba'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    'f830779d-9e4b-40c9-b033-24fe29cc082f',
    'ea6f1275-2c3f-414a-8476-5436a48dccba'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    'f830779d-9e4b-40c9-b033-24fe29cc082f',
    '89991a13-105e-4217-be45-24b37061b067'
    );

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    'f830779d-9e4b-40c9-b033-24fe29cc082f',
    'a90d8604-a827-4c5e-bdf1-bfdfd33a6ccd'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    'e1dc3bb1-b01b-4d82-b015-69ab5b6f3745',
    'ea6f1275-2c3f-414a-8476-5436a48dccba'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    'e1dc3bb1-b01b-4d82-b015-69ab5b6f3745',
    '89991a13-105e-4217-be45-24b37061b067'
    );

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    'e1dc3bb1-b01b-4d82-b015-69ab5b6f3745',
    'a90d8604-a827-4c5e-bdf1-bfdfd33a6ccd'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    'fb8595cb-2975-4323-8503-372e54171f62',
    'ea6f1275-2c3f-414a-8476-5436a48dccba'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    'fb8595cb-2975-4323-8503-372e54171f62',
    '89991a13-105e-4217-be45-24b37061b067'
    );

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    'fb8595cb-2975-4323-8503-372e54171f62',
    'a90d8604-a827-4c5e-bdf1-bfdfd33a6ccd'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    '8035d47a-ef60-4281-8565-3b0a8fe88567',
    '89991a13-105e-4217-be45-24b37061b067'
    );

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    '8035d47a-ef60-4281-8565-3b0a8fe88567',
    'a90d8604-a827-4c5e-bdf1-bfdfd33a6ccd'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    '15068440-cafe-4c6d-a59e-82d47b844666',
    'ea6f1275-2c3f-414a-8476-5436a48dccba'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    '15068440-cafe-4c6d-a59e-82d47b844666',
    '89991a13-105e-4217-be45-24b37061b067'
    );

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    '15068440-cafe-4c6d-a59e-82d47b844666',
    'a90d8604-a827-4c5e-bdf1-bfdfd33a6ccd'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    '87efe7a2-164f-4ddb-a9ad-01f572eade95',
    'a90d8604-a827-4c5e-bdf1-bfdfd33a6ccd'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    '439fbf8d-dc54-448f-b3d9-aacf601adf80',
    'ea6f1275-2c3f-414a-8476-5436a48dccba'
);

INSERT INTO emissores (cartorio_uuid, certidoes_uuid) VALUES (
    '439fbf8d-dc54-448f-b3d9-aacf601adf80',
    '89991a13-105e-4217-be45-24b37061b067'
    );
