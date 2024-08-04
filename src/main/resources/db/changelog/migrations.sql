-- create scanners
INSERT INTO inventory_service.scanners (hr_id) VALUES ('sc_im_000001');
INSERT INTO inventory_service.scanners (hr_id) VALUES ('sc_im_000002');

-- creates stages for model
INSERT INTO inventory_service.stages (id, model, stage_name) VALUES (1, 'medeya_still', 'резка');
INSERT INTO inventory_service.stages (id, model, stage_name) VALUES (2, 'medeya_still', 'шитье');
INSERT INTO inventory_service.stages (id, model, stage_name) VALUES (3, 'medeya_still', 'упаковка');

UPDATE inventory_service.stages SET next_stage = 2 WHERE id = 1;
UPDATE inventory_service.stages SET previous_stage = 1, next_stage = 3 WHERE id = 2;
UPDATE inventory_service.stages SET previous_stage = 2 WHERE id = 3;

