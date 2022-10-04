-- noinspection SqlNoDataSourceInspectionForFile

INSERT INTO galaxy (id, name)
VALUES ('8d3d4c3b-0718-4b95-bd33-d8b455fe1601', 'Melkweg');
INSERT INTO galaxy (id, name)
VALUES ('c8391e07-4a87-42a5-af69-e284df8e0af7', 'Andromeda');

INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('1c8efd7c-0183-443a-b5f7-78e9e8d3e656', 'Sol', null, null, null);
INSERT INTO star (id, type, galaxy_id)
VALUES ('1c8efd7c-0183-443a-b5f7-78e9e8d3e656', 'YELLOW_DWARF', '8d3d4c3b-0718-4b95-bd33-d8b455fe1601');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('6abc3e95-83f1-4803-be78-65a67e304861', 'Betelgeuse', null, null, null);
INSERT INTO star (id, type, galaxy_id)
VALUES ('6abc3e95-83f1-4803-be78-65a67e304861', 'RED_SUPERGIANT', '8d3d4c3b-0718-4b95-bd33-d8b455fe1601');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('956c4cc2-9b78-46b6-b349-cc61dd4642ee', 'Vega', null, null, null);
INSERT INTO star (id, type, galaxy_id)
VALUES ('956c4cc2-9b78-46b6-b349-cc61dd4642ee', 'MAIN_SEQUENCE', '8d3d4c3b-0718-4b95-bd33-d8b455fe1601');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('87a3fb27-5334-4eea-b82c-02043062b11e', 'Sirius', null, null, null);
INSERT INTO star (id, type, galaxy_id)
VALUES ('87a3fb27-5334-4eea-b82c-02043062b11e', 'MAIN_SEQUENCE', '8d3d4c3b-0718-4b95-bd33-d8b455fe1601');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('1ca20a6f-4e0f-4250-9a43-59a308b03e08', 'Arcturus', null, null, null);
INSERT INTO star (id, type, galaxy_id)
VALUES ('1ca20a6f-4e0f-4250-9a43-59a308b03e08', 'RED_GIANT', '8d3d4c3b-0718-4b95-bd33-d8b455fe1601');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('54238154-658e-40d2-a6d2-72f891c60c5f', 'Rigel', null, null, null);
INSERT INTO star (id, type, galaxy_id)
VALUES ('54238154-658e-40d2-a6d2-72f891c60c5f', 'BLUE_SUPERGIANT', '8d3d4c3b-0718-4b95-bd33-d8b455fe1601');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('d034342e-eb2a-48c7-9c85-8efed71c5262', 'Capella', null, null, null);
INSERT INTO star (id, type, galaxy_id)
VALUES ('d034342e-eb2a-48c7-9c85-8efed71c5262', 'RED_DWARF', '8d3d4c3b-0718-4b95-bd33-d8b455fe1601');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('9d830d54-d9b7-42f5-aa92-db9e1c8d1bb5', 'Antares', null, null, null);
INSERT INTO star (id, type, galaxy_id)
VALUES ('9d830d54-d9b7-42f5-aa92-db9e1c8d1bb5', 'RED_SUPERGIANT', '8d3d4c3b-0718-4b95-bd33-d8b455fe1601');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('32cb50a3-3827-4995-bb24-a1bf242e2b68', 'Aldebaran', null, null, null);
INSERT INTO star (id, type, galaxy_id)
VALUES ('32cb50a3-3827-4995-bb24-a1bf242e2b68', 'RED_GIANT', '8d3d4c3b-0718-4b95-bd33-d8b455fe1601');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('779dc4cf-e22b-4001-a79e-2b799bc08232', 'Fomalhaut', null, null, null);
INSERT INTO star (id, type, galaxy_id)
VALUES ('779dc4cf-e22b-4001-a79e-2b799bc08232', 'MAIN_SEQUENCE', '8d3d4c3b-0718-4b95-bd33-d8b455fe1601');

INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('1a317980-62b7-4ac8-a6b2-78ebe8b077f0', 'Jupiter', 11.862, 0.0489, '1c8efd7c-0183-443a-b5f7-78e9e8d3e656');
INSERT INTO planet (id, gaseous)
VALUES ('1a317980-62b7-4ac8-a6b2-78ebe8b077f0', true);
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('caf47def-e31b-44c8-8e62-662be7d65e2d', 'Venus', 0.615198, 0.006772, '1c8efd7c-0183-443a-b5f7-78e9e8d3e656');
INSERT INTO planet (id, gaseous)
VALUES ('caf47def-e31b-44c8-8e62-662be7d65e2d', false);
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('813ae614-ed2d-4156-b6d7-a6e5e9b1c296', 'Mars', 1.88085, 0.0934, '1c8efd7c-0183-443a-b5f7-78e9e8d3e656');
INSERT INTO planet (id, gaseous)
VALUES ('813ae614-ed2d-4156-b6d7-a6e5e9b1c296', false);
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('80d4df3e-2240-424d-8b76-b410b252389c', 'Saturnus', 29.4571, 0.0565, '1c8efd7c-0183-443a-b5f7-78e9e8d3e656');
INSERT INTO planet (id, gaseous)
VALUES ('80d4df3e-2240-424d-8b76-b410b252389c', true);
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('bf4c72e1-c416-4938-8291-b10d0f4ceac4', 'Mercurius', 0.240846, 0.205630,
        '1c8efd7c-0183-443a-b5f7-78e9e8d3e656');
INSERT INTO planet (id, gaseous)
VALUES ('bf4c72e1-c416-4938-8291-b10d0f4ceac4', false);
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('273974a5-caf8-46a6-b5c4-440f6fbece3c', 'Terra', 1.00001742096, 0.0167086,
        '1c8efd7c-0183-443a-b5f7-78e9e8d3e656');
INSERT INTO planet (id, gaseous)
VALUES ('273974a5-caf8-46a6-b5c4-440f6fbece3c', false);
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('0970f78e-c852-4751-ba3f-8fb8a3bb6d98', 'Neptunus', 164.8, 0.008678, '1c8efd7c-0183-443a-b5f7-78e9e8d3e656');
INSERT INTO planet (id, gaseous)
VALUES ('0970f78e-c852-4751-ba3f-8fb8a3bb6d98', true);
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('ccacf5a2-303f-4ab2-bdec-f119d3f1fe60', 'Uranus', 84.0205, 0.04717, '1c8efd7c-0183-443a-b5f7-78e9e8d3e656');
INSERT INTO planet (id, gaseous)
VALUES ('ccacf5a2-303f-4ab2-bdec-f119d3f1fe60', true);

INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('60887d5d-6c01-450d-8c84-ec628e096a40', 'Ceres', 4.60, 0.0785, '1c8efd7c-0183-443a-b5f7-78e9e8d3e656');
INSERT INTO planetoid (id, shape)
VALUES ('60887d5d-6c01-450d-8c84-ec628e096a40', 'SPHERICAL');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('5583daa0-5961-4d5f-94d9-f71a39eaf5b6', 'Eris', 559.07, 0.43607, '1c8efd7c-0183-443a-b5f7-78e9e8d3e656');
INSERT INTO planetoid (id, shape)
VALUES ('60887d5d-6c01-450d-8c84-ec628e096a40', 'SPHERICAL');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('f6cb2906-9d84-4ba5-9491-e7be5082987e', 'Makemake', 306.21, 0.16126, '1c8efd7c-0183-443a-b5f7-78e9e8d3e656');
INSERT INTO planetoid (id, shape)
VALUES ('60887d5d-6c01-450d-8c84-ec628e096a40', 'SPHERICAL');

INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('0076f576-6ac0-48b0-b898-dbb25504e2ef', 'Luna', 0.07485386575, 0.0549, '273974a5-caf8-46a6-b5c4-440f6fbece3c');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('1a9375bc-7606-4888-8a27-cf57838114ba', 'Titan', 15.945, 0.0288, '80d4df3e-2240-424d-8b76-b410b252389c');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('f0ee90a3-b242-4d2e-8a5a-bb2fd118cc9b', 'Enceladus', 1.370218, 0.0047, '80d4df3e-2240-424d-8b76-b410b252389c');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('be4ca182-8869-4b7b-9b2d-63e6608adac5', 'Mimas', 0.942421959, 0.0196, '80d4df3e-2240-424d-8b76-b410b252389c');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('9cd4f1f3-453f-4f84-827d-27acc6c186a3', 'Europa', null, null, '1a317980-62b7-4ac8-a6b2-78ebe8b077f0');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('cf0a283c-1caa-45be-9fb5-2be65b6a44bd', 'Io', null, null, '1a317980-62b7-4ac8-a6b2-78ebe8b077f0');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('7b9ee190-3e04-4952-9837-7caf327a454a', 'Ganymedes', null, null, '1a317980-62b7-4ac8-a6b2-78ebe8b077f0');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('a69a202c-2691-4114-b8f7-9aef99cea844', 'Callisto', null, null, '1a317980-62b7-4ac8-a6b2-78ebe8b077f0');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('51ed66d8-0f6e-40bb-b073-9e263e1b62ed', 'Phobos', null, null, '813ae614-ed2d-4156-b6d7-a6e5e9b1c296');
INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('e84d4acf-6cf4-42d5-810d-48b02e986295', 'Deimos', null, null, '813ae614-ed2d-4156-b6d7-a6e5e9b1c296');

INSERT INTO space_object (id, name, orbital_period, eccentricity, central_body_id)
VALUES ('7c91631e-6897-4573-a10c-5e7b4ab2b08b', 'Fomalhaut b', null, null, '779dc4cf-e22b-4001-a79e-2b799bc08232');
