<?php
namespace Airavata\Model\Job;

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


class JobModel {
  static $_TSPEC;

  /**
   * @var string
   */
  public $jobId = null;
  /**
   * @var string
   */
  public $taskId = null;
  /**
   * @var string
   */
  public $processId = null;
  /**
   * @var string
   */
  public $jobDescription = null;
  /**
   * @var int
   */
  public $creationTime = null;
  /**
   * @var \Airavata\Model\Status\JobStatus[]
   */
  public $jobStatuses = null;
  /**
   * @var string
   */
  public $computeResourceConsumed = null;
  /**
   * @var string
   */
  public $jobName = null;
  /**
   * @var string
   */
  public $workingDir = null;
  /**
   * @var string
   */
  public $stdOut = null;
  /**
   * @var string
   */
  public $stdErr = null;
  /**
   * @var int
   */
  public $exitCode = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'jobId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'taskId',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'processId',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'jobDescription',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'creationTime',
          'type' => TType::I64,
          ),
        6 => array(
          'var' => 'jobStatuses',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\Status\JobStatus',
            ),
          ),
        7 => array(
          'var' => 'computeResourceConsumed',
          'type' => TType::STRING,
          ),
        8 => array(
          'var' => 'jobName',
          'type' => TType::STRING,
          ),
        9 => array(
          'var' => 'workingDir',
          'type' => TType::STRING,
          ),
        10 => array(
          'var' => 'stdOut',
          'type' => TType::STRING,
          ),
        11 => array(
          'var' => 'stdErr',
          'type' => TType::STRING,
          ),
        12 => array(
          'var' => 'exitCode',
          'type' => TType::I32,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['jobId'])) {
        $this->jobId = $vals['jobId'];
      }
      if (isset($vals['taskId'])) {
        $this->taskId = $vals['taskId'];
      }
      if (isset($vals['processId'])) {
        $this->processId = $vals['processId'];
      }
      if (isset($vals['jobDescription'])) {
        $this->jobDescription = $vals['jobDescription'];
      }
      if (isset($vals['creationTime'])) {
        $this->creationTime = $vals['creationTime'];
      }
      if (isset($vals['jobStatuses'])) {
        $this->jobStatuses = $vals['jobStatuses'];
      }
      if (isset($vals['computeResourceConsumed'])) {
        $this->computeResourceConsumed = $vals['computeResourceConsumed'];
      }
      if (isset($vals['jobName'])) {
        $this->jobName = $vals['jobName'];
      }
      if (isset($vals['workingDir'])) {
        $this->workingDir = $vals['workingDir'];
      }
      if (isset($vals['stdOut'])) {
        $this->stdOut = $vals['stdOut'];
      }
      if (isset($vals['stdErr'])) {
        $this->stdErr = $vals['stdErr'];
      }
      if (isset($vals['exitCode'])) {
        $this->exitCode = $vals['exitCode'];
      }
    }
  }

  public function getName() {
    return 'JobModel';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->jobId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->taskId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->processId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->jobDescription);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->creationTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::LST) {
            $this->jobStatuses = array();
            $_size0 = 0;
            $_etype3 = 0;
            $xfer += $input->readListBegin($_etype3, $_size0);
            for ($_i4 = 0; $_i4 < $_size0; ++$_i4)
            {
              $elem5 = null;
              $elem5 = new \Airavata\Model\Status\JobStatus();
              $xfer += $elem5->read($input);
              $this->jobStatuses []= $elem5;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->computeResourceConsumed);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 8:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->jobName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 9:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->workingDir);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 10:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->stdOut);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 11:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->stdErr);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 12:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->exitCode);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('JobModel');
    if ($this->jobId !== null) {
      $xfer += $output->writeFieldBegin('jobId', TType::STRING, 1);
      $xfer += $output->writeString($this->jobId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->taskId !== null) {
      $xfer += $output->writeFieldBegin('taskId', TType::STRING, 2);
      $xfer += $output->writeString($this->taskId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->processId !== null) {
      $xfer += $output->writeFieldBegin('processId', TType::STRING, 3);
      $xfer += $output->writeString($this->processId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->jobDescription !== null) {
      $xfer += $output->writeFieldBegin('jobDescription', TType::STRING, 4);
      $xfer += $output->writeString($this->jobDescription);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->creationTime !== null) {
      $xfer += $output->writeFieldBegin('creationTime', TType::I64, 5);
      $xfer += $output->writeI64($this->creationTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->jobStatuses !== null) {
      if (!is_array($this->jobStatuses)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('jobStatuses', TType::LST, 6);
      {
        $output->writeListBegin(TType::STRUCT, count($this->jobStatuses));
        {
          foreach ($this->jobStatuses as $iter6)
          {
            $xfer += $iter6->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->computeResourceConsumed !== null) {
      $xfer += $output->writeFieldBegin('computeResourceConsumed', TType::STRING, 7);
      $xfer += $output->writeString($this->computeResourceConsumed);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->jobName !== null) {
      $xfer += $output->writeFieldBegin('jobName', TType::STRING, 8);
      $xfer += $output->writeString($this->jobName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->workingDir !== null) {
      $xfer += $output->writeFieldBegin('workingDir', TType::STRING, 9);
      $xfer += $output->writeString($this->workingDir);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->stdOut !== null) {
      $xfer += $output->writeFieldBegin('stdOut', TType::STRING, 10);
      $xfer += $output->writeString($this->stdOut);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->stdErr !== null) {
      $xfer += $output->writeFieldBegin('stdErr', TType::STRING, 11);
      $xfer += $output->writeString($this->stdErr);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->exitCode !== null) {
      $xfer += $output->writeFieldBegin('exitCode', TType::I32, 12);
      $xfer += $output->writeI32($this->exitCode);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}


